package step02;

public class Exam08_3 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 98765678;
        long l = 98765678;
        char c = 100;

        float f;
        double d;

        f = b; // 값을 그대로 저장
        System.out.println(f);

        f = s; //값을 그대로 저장
        System.out.println(f);

        f = c; //값을 그대로 저장
        System.out.println(f);
        
        f = i; //int(4) ==> float(4).
               //가수부 크기(23비트를 넘는 정수는 짤린다.)
               //유효자릿수를 넘는 정수는 짤린다.
               //주의 ! 컴파일 오류가 발생하지 않는다.
        System.out.println(f);
        
        d = i; //int(4) ==> double(8).
               //double의 가수부는 52비트 크기를 갖는다.
               //따라서 int(32비트) 값을 그대로 저장할 수 있다.
        System.out.println(d);

        l = 18_2345_3456_4567_5678L; //52비트가 넘어가는 정수
        d = l; //long(8) ==> double(8)
               //long(64비트) 값을 double메모리에 저장할 때
               //52비트 가수부를 넘어간다면 짤린다.
               //주의 ! 컴파일 오류가 발생하지 않는다.
        System.out.println(d);
            
               
    }
}

/**
 정수 메모리의 값(byte, short, char, int, long)을 
 부동소수점 메모리(float, double)에 저장할 때
 주의해서 사용하라 !
 큰 정수 값이 부동소수점 메모리에 저장될 때 짤릴 수 있다.
 컴파일 오류가 발생하지 않기 때문에 
 개발자들이 놓치는 경우가 많다!
 */