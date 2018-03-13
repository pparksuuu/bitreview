package step05.assignment;

import java.util.Scanner;

public class test01 {
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
        
    }
}