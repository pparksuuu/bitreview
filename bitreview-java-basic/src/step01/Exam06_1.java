//부동소수점의 리터럴
package step01;

public class Exam06_1 {
    public static void main(String[] args) {
        System.out.println(3.14);

        //exponentianl 기호를 사용하기.
        //=> 숫자e지수 또는 숫자E지수
        System.out.println(0.0314e2); //0.0314 * 10^2
        System.out.println(0.314e1);
        System.out.println(31.4e-1);
        System.out.println(314e-2);
        // => e 기호를 사용하면 소수점의 위치를 조정할 수 있다.
        // 소수점의 위치를 움직인다고 해서 "부동소수점" 이라 부른다.
    }
}