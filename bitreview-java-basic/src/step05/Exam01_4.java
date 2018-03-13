// 흐름 제어문 - 조건문 if
package step05;

public class Exam01_4 {
    public static void main(String[] args) {
        int age = 17;

        if (age < 19)
            System.out.println("미성년입니다.");
        
        //else문을 사용하는 아주 모범적인 예!
        if (age >= 19)
            System.out.println("성인입니다.");
        else
            System.out.println("미성년입니다.");
    }
}