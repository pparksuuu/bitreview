// 흐름 제어문 - if문의 조건
package step05;

public class Exam01_3 {
    public static void main(String[] args) {

        // if 문의 조건은 반드시 boolean 데이터여야 한다.
        if (true) System.out.println("1111");
        if (false) System.out.println("2222");
        if (10 < 8 + 5) System.out.println("3333");

        //if (1) System.out.println("4444");//컴파일 오류;
        //if(3.14f) System.out.println("5555");
        //if(0b0000_0001) System.out.println("6666");

        int a = 100;
        if (a == 100) System.out.println("7777");

        //if (a = 100) System.out.println("8888");
        
    }
}