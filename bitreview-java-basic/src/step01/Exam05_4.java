//정수의 리터럴 - 메모리에 저장하는 방법.
package step01;

public class Exam05_4 {
    public static void main(String[] args) {
        System.out.println(5 - 3);
        System.out.println(5 + (-3));
    }
}


// 결론
// => 자바에서는 정수를 저장할 때 2의 보수 방법을 사용한다.
// => 부동소수점을 저장할 때는
//    가수부는 'Sign-Magnitude 방식'으로 저장하고,
//    지수부는 'Excess-K 방식'으로 저장한다. 
