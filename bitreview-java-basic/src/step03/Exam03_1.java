//레퍼런스 배열 - 사용 전
package step03;

public class Exam03_1 {
    public static void main(String[] args) {
        //여러 개의 인스턴스 주소 저장하기.
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }

        //Score 레퍼런스 선언 + 인스턴스 생성(사용할 메모리 확보)
        Score s1 = new Score();
        Score s2;
        s2 = s1;

        s1.name = "홍길동";
        System.out.println(s2.name);
    }
}