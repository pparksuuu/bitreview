// 흐름 제어문 - for 반복문과 배열
package step05;

public class Exam04_3 {
    public static void main(String[] args) {
        String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
        
        System.out.println("====================");

        for(String name : names)
            System.out.println(name);
    }
}