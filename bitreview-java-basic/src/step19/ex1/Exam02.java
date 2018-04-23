package step19.ex1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Exam02 {
    public static void main(String[] args) {
        File packageDir = new File("C:\\Users\\Bit\\git\\bitreview\\bitreview-java-basic\\src\\step19\\ex1");
        
        
        List<File> files = findFiles(packageDir);
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.printf("d %s\n", f.getName());
            } else  {
                System.out.printf("- %s\n", f.getName());
            }
        }
    }
    
    
    
    
    static List<File> findFiles(File dir) {
        ArrayList<File> list = new ArrayList<>();
        
        File[]files = dir.listFiles();
        for (File f : files) {
            list.add(f);
        }
        return list;
    }
}
