//메서드 : 사용 전
package step06;

import java.util.Scanner;

public class Exam01_1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변 길이? ");
        int len = keyScan.nextInt();



        int starLen = 1;
        while (starLen <= len) {

            int spaceCount = 1;
            int spaceLen = (len - starLen) / 2;
            while (spaceCount <= spaceLen) {
                System.out.print(" ");
                spaceCount++;
            }

            int starCount = 1;
            while (starCount <= starLen) {
                System.out.print("*");
                starCount++;
            }
            System.out.println();
            starLen += 2;
        }
        
    }
}