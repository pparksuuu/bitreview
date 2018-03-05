//부동소수점의 리터럴 - 크기
package step01;

public class Exam06_2 {
    public static void main(String[] args) {
        //4바이트 크기의 부동소수점
        System.out.println(3.14f);
        //8바이트 크기의 부동소수점
        System.out.println(3.14);

        //정수는 메모리의 크기에 따라 최소/최대가 정해진다.
        //부동소수점의 최소/최대값은?

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        //4byte 부동소수점 테스트(유효자리 7자리까지는 거의 가능)
        System.out.println("---------------------------");
        System.out.println(987.6543f);
        
        //값이 잘리는 부동소수점
        //System.out.println(98765435f);

        //8byte 부동소수점 테스트(유효자리 15자리까지는 거의 가능)
        System.out.println(987654.345678);
    
        //값이 잘리는 부동소수점
        //System.out.println(987654.34567823777);
        System.out.println(7 * 0.1);
        
    }
}