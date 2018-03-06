//배열 - 배열 선언과 사용
package step02;

public class Exam09_1 {
    public static void main(String[] args) {
        //배열 선언
        int[] arr1 = new int[5]; //JAVA-style
      / int arr2[] = new int[5]; //C-style

        //1) 배열 선언 + 초기화 명령
        int[] arr3 = new int[]{0, 0, 0, 0, 0, 0};
        int[] arr4 = {0, 0, 0, 0};

        //2) 배열 선언 ==> 초기화 명령
        int[] arr5;
        arr5 = new int[]{0, 0, 0, 0, 0};    

        //배열 선언+ 초기화는 동시에는 가능하지만,
        //배열을 선언하고나서 초기화할 때는 new를 꼭 붙여줘야 한다.
        

        System.out.println(arr3[0]);
    }
}