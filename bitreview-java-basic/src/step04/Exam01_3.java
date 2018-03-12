//산술 연산자 : 암시적 형 변환
package step04;

public class Exam01_3 {
    public static void main(String[] args) {
        byte b = 5 + 6;
        byte x = 5, y = 6, z;
        z = x + y; //컴파일 오류
    }
}