package bitcamp.java106.pms.context;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import bitcamp.java106.pms.annotation.Component;

public class ApplicationContext {
    private HashMap<String, Object> objPool = new HashMap<>();
    
    public ApplicationContext(String packageName, Map<String, Object> beans) throws Exception {
        // 다른 맵에서 들어있는 객체를 이 컨테이너에 복사한다.
        if (beans != null) {
            objPool.putAll(beans);
        }
         
        // 1) 패키지 이름에 포함된 .을 파일 경로의 /로 변경한다.

        // 2) 해당 경로의 디렉토리를 classpath에서 찾아 실제 경로를 알아낸다.
        //    프로그램과 관련된 파일을 일반 경로에 두는 것 보다
        //    JVM이 알고 있는 경로(CLASSPATH)에 두면 해당 파일을 보다 쉽게 찾을 수 있다.
        //    왜냐하면,
        //    JVM이 모르는 특정 경로에 파일을 두면,
        //    그 파일을 찾기 위해서 소스 코드에 그 특정 경로를 지정해야 한다.
        //    만약 프로그램을 다른 OS에 배포하거나 경로가 달라진다면
        //    또 소스 코드를 변경해야 하는 번거로움이 발생한다.
        //    그래서 실무에서는 이런 문제를 해결하기 위해
        //    프로그램과 관련된 파일은 주로 CLASSPATH에 둔다.

        // 3) CLASSPATH에 파일을 두었을 때 그 파일의 실제 경로를 알아내는 방법
        //    CLASSPATH를 뒤져 파일을 찾아줄 객체를 얻는다.
        //    => ClassLoader
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        //    
        //    클래스 로더를 이용하여 특정 패키지나 클래스의 절대 경로를 알아낸다.
        //    => 클래스 로더는 디렉토리나 파일을 찾을 때 JVM에 지정된 CLASSPATH에서 찾는다.
        //       따라서 프로그램을 작성할 때 해당 패키지나 파일이 있는 경로를
        //       코드에 지정할 필요가 없어 편리하다.
        //    => 디렉터리 경로를 지정할 때 / 를 사용하라!
        //    => getResource()가 리턴하는 것은 찾은 자원의 경로 정보이다.
        //    => 같은 경로의 자원이 여러 디렉토리에 중복해서 있을 때는
        //       getResources()를 호출하여 여러 개의 경로 정보를 받아라!
        //    => 자원의 경로 정보를 담고 있는 URL 객체를 리턴한다.
        
        // 4) URL에서 실제 경로를 뽑아 File 객체를 생성한다.
        File dir = new File(classLoader.getResource(
                packageName.replace(".", "/")).getPath());

        // 5) 해당 파일의 경로가 디렉토리를 가리키고 있다면, 그 디렉토리의 파일 목록을 알아낸다.
        if (!dir.isDirectory())
            return;
        
        findAndInstantiateClasses(dir, packageName);
    }
    
    private void findAndInstantiateClasses(File dir, String packageName) throws Exception {
        // 파일 경로에서 패키지명과 클래스명을 추출할 수 없다.
        // 그래서 파일을 찾을 때 패키지 이름을 따로 관리해야 한다.
        // FileFilter를 이용하여 .class 파일만 추출한다.
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || // 디렉토리이거나
                        (pathname.getName().endsWith(".class") && // .class파일인 경우
                                !pathname.getName().contains("$"))) { // 단 중첩 클래스는 제외
                    return true;
                }
                return false;
            }
        });
        
        for (File f : files) {
            if (f.isDirectory()) {
                // FileFilter를 통해 걸러진 f 중 디렉토리가 있다면, 
                // 다시 findAndInstantiateClasses를 재귀호출하여 .class 파일만 추출한다.
                findAndInstantiateClasses(f, packageName + "." + f.getName());
                continue;
            }
            
            
            // classname에는 '~~~.class'의 형태로 들어가있다.
            String classname = f.getName();
            
            // 클래스 이름을 Class 객체를 만든다.
            // => 왜?
            // Class 객체가 있으면 언제라도 인스턴스를 생성할 수 있기 때문이다.
            // '.class'을 떼고 진짜 파일들의 이름을 clazz에 저장한다. 그래서 -6을 한 것. 
            Class clazz = Class.forName(packageName + "." + 
                    classname.substring(0, classname.length() - 6));
            
            // 이미 해당 타입의 객체가 생성되어 있다면 다시 생성하지 않는다.
            if (objPool.get(clazz.getName()) != null)
                continue;
            
            Object obj = createObject(clazz);
            if (obj != null) {
                // 지정한 Component의 이름으로 obj를 저장한다.
                this.objPool.put(getComponentName(clazz), obj);
            }
        }
    }
    
    private String getComponentName(Class clazz) throws Exception {
        Component anno = (Component) clazz.getAnnotation(Component.class);
        String label = anno.value();
        if (label.length() == 0)
            return clazz.getName();
        return label;
    }
    
    private Object createObject(Class clazz) throws Exception {
        // Class 객체를 이용하여 인스턴스를 만들어 저장한다.
        if (!isComponent(clazz))
            return null;
        
        try {
            // 파라미터가 없는 기본 생성자를 찾는다.
            clazz.getConstructor();
            // 기본 생성자를 호출하여 객체를 생성한다.
            return clazz.newInstance();
        } catch (Exception e) {
            Constructor[] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                Object obj = callConstructor(constructor);
                if (obj != null)
                    return obj;
            }
            return null;
        }
    }
    
    private boolean isComponent(Class clazz) throws Exception {
        // 애노테이션의 타입을 지정하여 해당 클래스에서 @Component 애노테이션 정보를 추출한다.
        Component anno = (Component) clazz.getAnnotation(Component.class);
        if (anno == null)
            return false;
        return true;
    }
    
    private Object callConstructor(Constructor constructor) throws Exception {
        if (containsDefaultType(constructor))
            return null;
        
        // 생성자의 파라미터 타입을 알아낸다.
        Class[] paramTypes = constructor.getParameterTypes();
        
        // 파라미터 타입에 해당하는 값을 저장할 보관소
        ArrayList<Object> paramValues = new ArrayList<>();
        for (Class paramType : paramTypes) {
            paramValues.add(findObject(paramType)); // 파라미터 값을 준비
        }
        
        // 파라미터 값이 준비되었기 때문에
        // 준비한 파라미터 값을 가지고 생성자를 호출하여 인스턴스를 만들어 리턴한다.
        return constructor.newInstance(paramValues.toArray());
    }
    
    private Object findObject(Class clazz) throws Exception {
        Object obj = objPool.get(clazz.getName());
        if (obj != null) { // 그 클래스 타입과 일치하는 객체가 있다면 그 객체를 리턴,
            return obj;
        }
        
        // 만약 objPool에 그런 타입의 객체가 없다면 새로 만들어 리턴,
        obj = clazz.newInstance();
        objPool.put(clazz.getName(), obj);
        return obj;
    }
    
    private boolean containsDefaultType(Constructor constructor) {
        Class[] defaultTypes = {
                byte.class, short.class, int.class, long.class,
                float.class, double.class, boolean.class, char.class,
                Byte.class, Short.class, Integer.class, Long.class,
                Float.class, Double.class, Boolean.class, Character.class,
                String.class
        };
        
        // 1) 생성자의 파라미터 정보를 꺼낸다.
        Class[] paramTypes = constructor.getParameterTypes();
        
        // 2) 생성자의 파라미터 타입이 primitive 타입이거나 Wrapper, String일 경우
        //    이 생성자를 호출할 때 해당 값을 줘서 호출해야 한다.
        //    문제는 어떤 값을 줘야 하는지, 예를 들면 int를 원한다면
        //    int 값으로 얼마를 줘야 하는지 여기서 결정할 수 없다.
        //    그래서 이런 생성자로는 객체를 생성할 수 없다.
        //    이런 생성자인지 검사한다.
        for (Class paramType : paramTypes) {
            for (Class defaultType : defaultTypes) {
                if (paramType == defaultType)
                    return true;
            }
        }
        return false;
    }
    
    public Object getBean(String name) {
        return objPool.get(name);
    }
}
