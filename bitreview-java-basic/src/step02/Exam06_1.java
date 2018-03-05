//문자 변수 - UTF-16(Unicode 2) 코드 값 저장
package step02;

public class Exam06_1 {
    public static void main(String[] args) {
        char c1, c2, c3;
        c1 = 0x41; // A문자의 UTF-16 코드 값
        c2 = 65; // A문자의 UTF-16 코드 값
        c3 = 0b0100_0001; //A문자의 UTF-16 코드 값

        //println()은 변수의 타입에 따라 출력을 달리한다.
        //- 변수의 종류가 char이면, 출력할 때 10진수로 출력하는 대신
        //해당 코드의 문자를 폰트 파일에서 찾아 출력한다

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        char c4 = '헐';

        System.out.println(c4);
        
        
    }
}

// 결론!
// - char 메모리에는 0에서 65535까지의 정수 값을 저장한다.
// - 즉 UTF-16에 정의된 문자에 대한 2바이트 코드 값을 저장하는 것이다.
// - 메모리의 문자를 직접 저장할 방법은 없다.
//   반드시 2진수로 변환하여 저장해야 된다.
// - 그것은 색깔, 빛의 세기, 소리 등에 동일하게 해당된다.
// - 즉 메모리에 저장하는 것은 2진수 값이다.
// - 결국 '가'의 의미는?
//   작은 따옴표는 아주 특별한 명령어이다.
//   작은 따옴표 안에 주어진 문자의 코드 값을 리턴하는 일을 한다.
//   '가' == 44032 값과 같다
//