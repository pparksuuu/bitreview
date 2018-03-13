package step05.assignment;

import java.util.Scanner;

public class test03 {
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