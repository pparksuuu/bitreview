package step22.ex02;

import java.io.FileReader;

public class Exam01_2 {
    public static void main(String[] args) throws Exception {
        FileReader in = new FileReader("temp/test2.txt");
        
        int ch = in.read();
        
        in.close();
        
        System.out.printf("%x\n", ch);
    }
}
