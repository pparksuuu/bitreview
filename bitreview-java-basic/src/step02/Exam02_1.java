//키보드 입력 받기
package step02;

public class Exam02_1 {
    public static void main(String[] args) {
        //키보드 정보를 가져온다.
        java.io.InputStream keyboard = System.in;
        
        //키보드에서 값을 꺼내주는 도구를 연결한다.
        java.util.Scanner KeyScan = new java.util.Scanner(keyboard);

        //print()는 문자열을 출력한 후 줄바꿈을 하지 않는다.
        System.out.print("팀명? ");
        System.out.println(KeyScan.nextLine());

    }
}