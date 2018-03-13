package step05.assignment;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        System.out.println("직삼각형의 밑변의 길이는? ");
        int len = keyScan.nextInt();
      //  int starCount = 0;
        int count = 1;
        while (count <= len) {
            int starCount = 1;
            while (starCount <= count) {
                System.out.print("*");
                starCount++;
            }
            System.out.println();
            count++;
            
        }

        count = len -1;
        while (count >= 1) {
            int starCount = 1;
            while (starCount <= count) {
                System.out.print("*");
                starCount++;
            }
            System.out.println();
            count--;
        }
        // count = 1;
        // int flag = len;
        // while (count <= len - 1) {
        //     int startCount = 1;
        //     while (startCount <= flag - 1) {
        //         System.out.print("*");
        //         startCount++;
        //     }
        //     flag--;
        //     System.out.println();
        //     count++;
        // }
        
    }
}