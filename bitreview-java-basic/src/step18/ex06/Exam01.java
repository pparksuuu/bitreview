package step18.ex06;

import java.net.URL;

public class Exam01 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        
        URL url = classLoader.getResource("step18/ex06");
        
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        
    }
}
