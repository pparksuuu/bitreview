<<<<<<< HEAD
//레퍼런스 배열 - 사용 후
=======
//레퍼런스 배열 - 사용 전
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
package step03;

public class Exam02_2 {
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



        //인스턴스를 만들어 레퍼런스 배열의 각 방에
        //그 주소를 저장한다.
=======
        Score[] arr = new Score[3];

>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
        arr[0] = new Score();
        arr[1] = new Score();
        arr[2] = new Score();

<<<<<<< HEAD
        //레퍼런스를 이용하여 인스턴스에 접근한 후
        //항목에 값을 넣는다.
=======
        //레퍼런스를 이용하여 인스턴스에 접근한 다음, 항목에 값을 넣는다.
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
        arr[0].name = "홍길동";
        arr[1].name = "임꺽정";
        arr[2].name = "유관순";

        //레퍼런스를 통해 인스턴스의 각 항목 값을 꺼낸다.
        System.out.printf("이름: %s\n",arr[0].name);
        System.out.printf("이름: %s\n",arr[1].name);
        System.out.printf("이름: %s\n",arr[2].name);

<<<<<<< HEAD
=======

>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
    }
}