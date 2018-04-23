package step19.ex2;

import java.io.File;
import java.util.List;

public class Exam05 {
    public static void main(String[] args) throws Exception {
        
        ApplicationContext3 appContext = new ApplicationContext3("step19.ex01");
        List<File> files = appContext.getFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.printf("d %s\n", f.getName());
            } else {
                System.out.printf("- %s\n", f.getName());
            }
        }
    }
}
