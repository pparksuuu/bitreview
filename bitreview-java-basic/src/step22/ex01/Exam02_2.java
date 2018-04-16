package step22.ex01;

import java.io.FileInputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test1.data");
        
        // 바이트들을 저장할 배열을 준비한다.
        // => 이렇게 임시 데이터를 저장하기 위해 만든 바이트 배열을 보통 "버퍼(buffer)"라 한다.
        byte[] buf = new byte[100];
        
        //read(버퍼의 주소)
        int count = in.read(buf);
        
        in.close();
        
        System.out.printf("%d\n", count);
        for (int i = 0; i < count; i++) {
            System.out.printf("%x ", buf[i]);
        }
        
        System.out.println();
    }
}
