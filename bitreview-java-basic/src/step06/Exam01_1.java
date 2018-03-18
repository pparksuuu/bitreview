//메서드 : 사용 전
<<<<<<< HEAD

=======
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
package step06;

import java.util.Scanner;

public class Exam01_1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
<<<<<<< HEAD
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        int starLen = 1;
        while (starLen <= len) {
            int spaceCnt = 1;
            int spaceLen = (len - starLen) / 2;
            while (spaceCnt <= spaceLen) {
                System.out.print(" ");
                spaceCnt++;
            }

            int starCnt = 1;
            while (starCnt <= starLen) {
                System.out.print("*");
                starCnt++;
=======

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
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
            }
            System.out.println();
            starLen += 2;
        }
<<<<<<< HEAD

=======
        
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
    }
}