package step19.ex1;

import java.io.File;
import java.util.List;

public class Exam04 {
    public static void main(String[] args) {
        File packageDir = new File("C:\\Users\\Bit\\git\\bitreview\\bitreview-java-basic\\src\\step19\\ex1");
        
        ApplicationContext2 appContext = new ApplicationContext2(packageDir);
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
