package step22.ex07;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/jls8.pdf");
        BufferedInputStream in = new BufferedInputStream(fileIn);
        
        FileOutputStream fileOut = new FileOutputStream("temp/jls8_5.pdf");
        BufferedOutputStream out = new BufferedOutputStream(fileOut);
        
        int b;
        
        long startTime = System.currentTimeMillis();
        
        while ((b = in.read()) != -1)
            out.write(b);
        
        long endTime = System.currentTimeMillis();
        
        System.out.println(endTime - startTime);
        
        in.close();
        out.close();
    }
}
