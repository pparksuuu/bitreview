package step22.ex02;

import java.io.FileWriter;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {
        FileWriter out = new FileWriter("temp/test2.txt");
        
        out.write(0x7a6bac00);
        
        out.close();
        
        System.out.println("출력 완료!");
    }
}
