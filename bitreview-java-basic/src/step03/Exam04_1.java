package step03;

public class Exam04_1 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Score s1 = new Score();
        s1.name = "홍길동";
        System.out.printf("이름: %s\n",s1.name);
=======
        //바깥 쪽에 별도 선언한 클래스를 사용하기.
        //같은 패키지 안에 있지만 source 혹은 class 정보를 
        //컴파일러에게 알려줘야 한다.
        Score s1 = new Score();
        s1.name = "홍길동";
        System.out.println(s1.name);
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
    }
}