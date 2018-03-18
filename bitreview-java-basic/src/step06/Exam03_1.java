//메서드 : call by value
package step06;

public class Exam03_1 {

    static void swap(int a, int b) {
        System.out.printf("swap(): a = %d, b = %d\n", a, b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", a, b);        
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        swap(a, b);
        System.out.printf("swap(): a = %d, b = %d\n", a, b);
        
    }
}