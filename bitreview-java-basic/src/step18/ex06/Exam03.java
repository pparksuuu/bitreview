package step18.ex06;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;

public class Exam03 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource("step18/ex06");
        
        File file = new File(url.getPath());
        File[] list = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".class") && !name.contains("$"))
                    return true;
                return false;
            }
            
        });
        for (File f : list) {
            System.out.println(f.getName());
        }
    }
}
