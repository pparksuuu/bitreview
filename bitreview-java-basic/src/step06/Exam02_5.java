//메서드 : 가변 파라미터
package step06;

public class Exam02_5 {

    static void hello(String... names) {
        for(String name : names) {
            System.out.printf("%s님 반갑습니다!", name);
        }
    }

    public static void main(String[] args) {
        hello();
        System.out.println("=================");

        hello("박수현");
        System.out.println("=================");

        hello("박수현", "졸려?");
        System.out.println("=================");

        String[] arr = {"박수현", "피카츄", "꼬부기"};
        hello(arr);
        
    }
}