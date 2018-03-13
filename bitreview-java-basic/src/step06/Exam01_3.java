//메서드 : 사용 후
package step06;

import java.util.Scanner;

public class Exam01_3 {

    /**
     * 스페이스를 출력하는 코드들을
     * 관리하기 쉽도록 별도의 블록에 모아 놓는다.
     * 그리고 그 블록에 대해 이름을 붙인다.
     * => 이렇게 정의한 블록을 "메서드(method)" 또는
     * "함수(function)"이라 부른다
     * => 자바는 "메서드" 이름을 주로 사용한다.
     */
    public static void printSpaces(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(" ");
        }
    }

    /**
     * '*' 문자를 출력하는 코드를 관리하기 쉽게 별도의 블록으로 빼둔다.
     * 그리고 그 블록의 이름을 붙인다.
     * 이렇게 별도로 빼둔 코드 블록에 이름을 붙인 것을 "메서드 = 함수" 라고 부른다.
     */

     public static void printStars(int len) {
         for (int i = 0; i < len; i++) {
             System.out.print("*");
         }
     }

     public static int getSpaceLength(int totalStar, int displayStar) {
         return (totalStar - displayStar) / 2;
     }

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변 길이? ");
        int len = keyScan.nextInt();

        for (int starLen = 1; starLen <= len; starLen +=2) {
            printSpaces(getSpaceLength(len, starLen));
            printStars(starLen);
            System.out.println();
        }
        
    }
}