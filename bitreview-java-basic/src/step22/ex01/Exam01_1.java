//Byte Stream - 바이트 단위로 출력하기
package step22.ex01;

import java.io.FileOutputStream;

public class Exam01_1 {
    public static void main(String[] args) throws Exception {
        // 1) 파일로 데이터를 출력하는 객체를 준비한다.
        FileOutputStream out = new FileOutputStream("temp/test1.data");
        
        // 2) 1바이트를 출력
        // => int 값을 아규먼트로 넘기더라도 맨 마지막 1바이트만 출력.
        out.write(0x7a6b5c4d);
        
        out.close();
        
        System.out.println("데이터 출력 완료!");
    }
}
