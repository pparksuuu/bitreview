<<<<<<< HEAD
//클래스 사용 - public 클래스와 기본 클래스
=======
//클래스의 사용 - public 클래스와 기본 클래스
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
package step03;

public class Exam04_3 {
    public static void main(String[] args) {
<<<<<<< HEAD
     //다른 패키지의 클래스 사용

    // step03.test.A v1;
     step03.test.B v2;
=======
        //=> A 클래스는 public이 아니다.
        //=> 따라서 다른 패키지의 클래스는 A를 사용할 수 없다!
        //step03.test.A v1;//컴파일 오류!

        //B클래스는 퍼블릭.
        //=>다른 패키지에 소속된 클래스도 B를 사용할 수 있다.
        step03.test.B v2;

>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
    }
}