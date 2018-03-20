//클래스 메서드 응용
package step08;

import java.util.Scanner;

public class Exam02_2 {
    
    static class Math {
        //다음 메서드와 같이 인스턴스 변수를 사용하지 않고
        //파라미터 값을 가지고 작업하는 경우에 보통 클래스 메서드로 정의한다.
        public static int abs(int value) {
            if (value < 0)
                return value * -1;
            return value;
        }
    }
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요> ");
        int value = keyScan.nextInt();
        
    }

}
