package step02;

public class Exam03_4 {
    public static void main(String[] args) {
        int a1, a2;
        a1 = 100;
        a2 = 200;
        System.out.println(a1);
        System.out.println(a2);

        int b1 = 100, b2 = 200;
        System.out.println(b1);
        System.out.println(b2);

        int c1 = 100, c2, c3 = 200, c4;
        System.out.println(c1);

        //java에서는 무조건 초기화를 해야 한다. c2,c4를 그냥 출력하거나 사용하면
        //컴파일 오류 !
        //System.out.println(c2);
    }
}