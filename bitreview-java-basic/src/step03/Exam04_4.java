//클래스 사용 - import
package step03;

import step03.test.B;

public class Exam04_4 {
    public static void main(String[] args) {
     //다른 패키지의 클래스 사용
     step03.test.B v1;
     v1 = new step03.test.B();

     //귀찮아...
     //소스 파일 상단에 클래스 패키지 정보를 미리 적어둔다.
     //=> import 패키지명.클래스명;
     B v2;
     v2 = new B();
    }
}