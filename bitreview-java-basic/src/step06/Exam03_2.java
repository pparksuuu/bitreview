//메서드 : call by reference
package step06;

public class Exam03_2 {
    static void swap(int[] a) {
        System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", a[0], a[1]);
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
        System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", a[0], a[1]);        
    }
    public static void main(String[] args) {
        int[] arr = new int[] {100, 200};
        swap(arr);
        System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    }
}