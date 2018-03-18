// 흐름 제어문 - for 반복문
package step05;

import java.util.Scanner;

public class Exam04_1 {
    public static void main(String[] args) {
        //for문의 전형적인 예
        for (int i = 0; i < 5; i++)
            System.out.println(i);
        
        System.out.println("======================");

        for (int i = 0; i < 5;) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("======================");
        int i = 0;
        for (; i < 5;) {
            System.out.println(i);
            i++;
        }

        System.out.println("======================");
        i = 0;
        for (;;) {
            if(i < 5)
                break;
            System.out.println(i);
            i++;
        }
    }
}