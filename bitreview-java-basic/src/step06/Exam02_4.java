package step06;

public class Exam02_4 {
    static String hello(String name, int age) {
        String retVal = String.format("%d살 %s님을 환영합니다!", age, name);
        return retVal;
    }
    public static void main(String[] args) {
        String r = hello("홍길동", 27);
        System.out.println(r);
    }
}