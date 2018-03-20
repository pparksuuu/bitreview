//생성자 - 생성자 호출 막기
package step08;

class X {
    private X() {
        System.out.println("X");
    }
}

public class Exam04_4 {

    public static void main(String[] args) {
        X obj1;
       // obj1 = new X();
    }

}
