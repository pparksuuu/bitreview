// 흐름 제어문 - while - break, continue
package step05;

public class Exam03_2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        //1부터 100까지 짝수의 합은?
        while (count < 100) {
            count++;
            if (count % 2 == 0) {
                sum += count;
            }
        }
        System.out.println("count = %d, sum = %d", count, sum);
        System.out.println("================");

        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if(count % 2 == 1)
                continue;
            sum += count;
            
        }

        count = 0;
        sum = 0;
        
    }
}