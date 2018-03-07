//클래스의 사용 - public 클래스와 기본 클래스
package step03;

import step03.test.B;

public class Exam04_4 {
    public static void main(String[] args) {
        step03.test.B v1;
        v1 = new step03.test.B();

        //위는 너무 복잡.
        //import를 사용 
        
        B v2 = new B(); 

    }
}