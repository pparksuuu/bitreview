//형변환 - 명시적 형변환 2
package step02;

public class Exam08_6 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;

        //큰 메모리의 값을 작은 메모리에 저장하는 경우
        // => 작은 메모리에 들어갈 수 있는 값인 경우에 형변환을 해야 한다.
        byte b2 = (byte)s;
        System.out.println(b2);

        b2 = (byte)i;
        System.out.println(b2);

        b2 = (byte)l;
        System.out.println(b2);

        short s2 = (short)l;
        System.out.println(s2);
        
        
    }
}