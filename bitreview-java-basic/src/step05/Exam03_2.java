<<<<<<< HEAD
=======
// 흐름 제어문 - while - break, continue
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
package step05;

public class Exam03_2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

<<<<<<< HEAD
        while (count < 0) {
            count++;
            sum += count;
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("=========================");

        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if( count % 2 == 0) {
                sum += count;
            }
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("=========================");
=======
        //1부터 100까지 짝수의 합은?
        while (count < 100) {
            count++;
            if (count % 2 == 0) {
                sum += count;
            }
        }
        System.out.println("count = %d, sum = %d", count, sum);
        System.out.println("================");
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f

        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
<<<<<<< HEAD
            if (count % 2 == 1)
                continue;
            sum += count;
                
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("=========================");



=======
            if(count % 2 == 1)
                continue;
            sum += count;
            
        }

        count = 0;
        sum = 0;
        
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
    }
}