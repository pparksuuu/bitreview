//레퍼런스 배열 - 사용 전
package step03;

public class Exam02_2 {
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

        Score[] arr = new Score[3];

        arr[0] = new Score();
        arr[1] = new Score();
        arr[2] = new Score();

        //레퍼런스를 이용하여 인스턴스에 접근한 다음, 항목에 값을 넣는다.
        arr[0].name = "홍길동";
        arr[1].name = "임꺽정";
        arr[2].name = "유관순";

        //레퍼런스를 통해 인스턴스의 각 항목 값을 꺼낸다.
        System.out.printf("이름: %s\n",arr[0].name);
        System.out.printf("이름: %s\n",arr[1].name);
        System.out.printf("이름: %s\n",arr[2].name);


    }
}