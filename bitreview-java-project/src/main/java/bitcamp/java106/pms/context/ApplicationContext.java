//미니 IOC 컨테이너
package bitcamp.java106.pms.context;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
    private HashMap<String,Object> objPool = new HashMap<>();

    public ApplicationContext(String packageName, Map<String,Object> beans) throws Exception {
        if (beans != null) {
            objPool.putAll(beans);
        }

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        File dir = new File(classLoader.getResource(
                packageName.replace(".","/")).getPath());
        if (!dir.isDirectory())
            return;

        findAndInstantiateClasses(dir, packageName);
    }

    private void findAndInstantiateClasses(File dir, String packageName) throws Exception{
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
        for (File f :files) {
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
            if (obj != null) {
                this.objPool.put(getComponentName(clazz), obj);
            }
        }
    }

    private String getComponentName(Class clazz) {
        // TODO Auto-generated method stub
        return null;
    }

    private Object createObject(Class clazz) {
        // TODO Auto-generated method stub
        return null;
    }
}
