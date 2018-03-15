//메서드 : 개념 및 기본문법
package step06;

import java.util.Scanner;

public class Exam02_2 {
    static void hello(String name, int age) {
        System.out.printf("%d살 %s님 반갑습니다!\n", age, name);
    }

    public static void main(String[] args) {
        hello("홍길동", 50);
        hello("수현", 27);
        
    }
}