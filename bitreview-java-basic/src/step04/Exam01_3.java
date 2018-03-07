package step04;

public class Exam01_3 {
    public static void main(String[] args) {
        byte b = 5 + 6;
        byte x = 5, y = 6, z;
        //z = x + y;// 컴파일 오류!
        // x, y -> 임시 4바이트 정수 "메모리"를 만들어서 연산 수행.
        //연산 결과도 당연히 4바이트 임시 정수 메모리!
        //4바이트 -> 1바이트 메모리에 넣지 못하기 때문에 컴파일 오류!

        short s1 = 5;
        short s2 = 6;
        int s3 = s1 + s2;

    }
}