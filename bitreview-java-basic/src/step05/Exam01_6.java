// 흐름 제어문 - 조건문 if
package step05;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Exam01_6 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = keyScan.nextInt();

        if (age < 8)
            System.out.println("아동입니다");
        else 
            if (age < 14) 
                System.out.println("어린이입니다.");                
            else 
                if (age < 19)
                    System.out.println("청소년입니다");
                else 
                    if (age < 65)
                        System.out.println("성인입니다");
                    else
                        System.out.println("노인입니다.");
                
            
        if (age < 8)
            System.out.println("아동입니다.");
        else if (age < 14)
            System.out.println("어린이입니다.");
        else if (age < 19)
            System.out.println("청소년입니다.");
        else if (age < 65)
            System.out.println("성인입니다.");
        else
            System.out.println("노인입니다.");


    }
}