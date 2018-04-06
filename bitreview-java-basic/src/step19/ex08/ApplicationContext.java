// 객체 생성할 때 의존 객체가 필요하다면 의존 객체를 생성하여 자동 주입시킨다.
package step19.ex08;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;

public class ApplicationContext {
    //클래스 이름으로 객체를 저장할 수 있도록 Map을 사용한다.
    private HashMap<String,Object> objPool = new HashMap<>();

    public ApplicationContext(String packageName) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        
        File dir = new File(classLoader.getResource(
                packageName.replace(".", "/")).getPath());

        if (!dir.isDirectory()) 
            return;
        
        findAndInstantiateClasses(dir, packageName);
    }

    private void findAndInstantiateClasses(File dir, String packageName) throws Exception {
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory() ||
                        (pathname.getName().endsWith(".class") &&
                                !pathname.getName().contains("$"))) {
                    return true;
                }
                return false;
            }
        });

        for (File f : files) {
            if (f.isDirectory()) {
                findAndInstantiateClasses(f, packageName + "." + f.getName());
                continue;
            }  

            String classname = f.getName();
            Class clazz = Class.forName(packageName + "." + 
                    classname.substring(0, classname.length() - 6));
            
            if (objPool.get(clazz.getName()) != null)
                continue;
            
            Object obj = createObject(clazz);
            if (obj != null)
                this.objPool.put(clazz.getName(), obj);

        }

    }
    private Object createObject(Class clazz) throws Exception {
        try {
            clazz.getConstructor(); //파라미터가 없는 기본 생성자를 찾는다.
            return clazz.newInstance(); //기본 생성자를 호출하여 객체를 생성한다.
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

    private Object callConstructor(Constructor constructor) throws Exception {
        if (containsDefaultType(constructor))
            return null;
        
        // 생성자의 파라미터 타입을 알아낸다.
        Class[] paramTypes = constructor.getParameterTypes();
        
        //파라미터 타입에 해당하는 값을 보관할 저장소
        ArrayList<Object> paramValues = new ArrayList<>();
        for (Class paramType : paramTypes) {
            paramValues.add(findObject(paramType));
        }
        
        return constructor.newInstance(paramValues.toArray());
        
    }
    

    private Object findObject(Class clazz) throws Exception {
        Object obj = objPool.get(clazz.getName());
        if (obj != null) {
            return obj;
        }
        
        obj = clazz.newInstance();
        objPool.put(clazz.getName(), obj);
        return obj;
    }

    public Object getBean(String name) {
        return objPool.get(name);
    }
    
    private boolean containsDefaultType(Constructor constructor) {
        Class[] defaultTypes = {
                byte.class, short.class, int.class, long.class,
                float.class, double.class, boolean.class, char.class,
                Byte.class, Short.class, Integer.class, Long.class,
                Float.class, Double.class, Boolean.class, Character.class,
                String.class
        };
        
        //1) 생성자의 파라미터 정보를 꺼낸다.
        Class[] paramTypes = constructor.getParameterTypes();
        
        //2) 생성자의 파라미터 타입이 primitive 타입이거나 Wrapper, String 일 경우
        //   이 생성자를 호출할 때 해당 값을 줘서 호출해야 한다.
        //   문제는 어떤 값을 줘야 하는지, 예를 들어 int를 원한다면 
        //   int 값으로 얼마를 줘야 하는지 여기 결정할 수 없다.
        //   그래서 이런 생성자로는 객체를 생성할 수 없다.
        //   이런 생성자인지 검사한다. 
        for (Class paramType : paramTypes) {
            for (Class defaultType : defaultTypes) {
                if (paramType == defaultType)
                    return true;
            }
        }
        return false;
    }
    
    
    
}
