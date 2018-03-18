<<<<<<< HEAD
//레퍼런스 배열 - 반복문 결합
=======
//레퍼런스 배열 - 사용 전
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
package step03;

public class Exam02_3 {
    public static void main(String[] args) {
<<<<<<< HEAD
=======
        //여러 개의 인스턴스 주소 저장하기.
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }

<<<<<<< HEAD
        //Score 레퍼런스를 여러 개 준비
        //=> 레퍼런스 배열 준비(인스턴스 배열이 아니다)!
        Score[] arr = new Score[3];

        //반복문을 이용하여 레퍼런스 배열에
        //인스턴스 주소를 저장한다.
        for(int i = 0; i < 3; i++) {
            arr[i] = new Score();
        }

        //값을 저장할 때는 일일이 값을 지정해야 한다.
=======
        Score[] arr = new Score[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Score();
        }

        //레퍼런스를 이용하여 인스턴스에 접근한 다음, 항목에 값을 넣는다.
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
        arr[0].name = "홍길동";
        arr[1].name = "임꺽정";
        arr[2].name = "유관순";

<<<<<<< HEAD

        for(int i = 0; i < 3; i++) {
            System.out.printf("이름: %s\n",arr[i].name);
        }
=======
        //레퍼런스를 통해 인스턴스의 각 항목 값을 꺼낸다.
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("이름: %s\n", arr[i].name);
        }


>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
    }
}