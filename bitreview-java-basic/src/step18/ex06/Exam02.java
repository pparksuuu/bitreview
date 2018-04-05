package step18.ex06;

import java.io.File;
import java.net.URL;

public class Exam02 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource("step18/ex06");
        
        File file = new File(url.getPath());
        File[] list = file.listFiles();
        for (File f : list) {
            System.out.println(f.getName());
        }
    }
}
