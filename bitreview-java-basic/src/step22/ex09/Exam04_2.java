package step22.ex09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam04_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileOut = new FileInputStream("temp/test9_5.data");
        BufferedInputStream bufOut = new BufferedInputStream(fileOut);
        ObjectInputStream in = new ObjectInputStream(bufOut);

        Score s = (Score) in.readObject();
        
        in.close();
        System.out.println(s);
        
        s.compute();
        System.out.println(s);
    }
}
