<<<<<<< HEAD
//중첩된 반복문 탈출!
package step05;

=======
// 흐름 제어문 - 중첩된 반복문 탈출
package step05;

import java.util.Scanner;

>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
public class Exam03_3 {
    public static void main(String[] args) {
        int x = 2, y = 1;

<<<<<<< HEAD
        //5 * 5까지만 출력하라!
        // 라벨명 : 반복문1 { 반복문2 {break라벨명;}}
=======
        // 5 * 5 까지만 출력하라!
        // 라벨명: 반복문 1 { 반복문2 {break 라벨명;}}
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f

        myloop:
        while (x <= 9) {
            while (y <= 9) {
                System.out.printf("%d * %d = %d\n", x, y, x * y);
<<<<<<< HEAD

                if (x == 5 && y ==5)
                    break myloop;
=======
                if(x == 5 && y == 5) {
                    break myloop;
                }
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}