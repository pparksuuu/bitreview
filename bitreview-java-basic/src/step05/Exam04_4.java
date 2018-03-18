<<<<<<< HEAD
=======
// 흐름 제어문 - for 반복문과 컬렉션
>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
package step05;

import java.util.ArrayList;

public class Exam04_4 {
    public static void main(String[] args) {
<<<<<<< HEAD
=======
         // 배열은 같은 타입의 값만 보관할 수 있지만
        // 컬렉션은 다른 타입의 값도 보관할 수 있다.
        // 
        // 배열은 크기가 고정되지만,
        // 컬렉션은 크기가 가변적이다.

>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(3.14f);
        list.add(true);
        list.add(365);

<<<<<<< HEAD
        for(int i = 0; i < list.size(); i++) 
            System.out.println(list.get(i));

        System.out.println("====================");

        for(Object value : list)
            System.out.println(value);
=======
        for (int i =0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("==================");

        //for문에 컬렉션도 적용할 수 있다
        //for (변수선언 : 컬랙션객체) 문장;
        for(Object value : list) {
            System.out.println(value);
        }

>>>>>>> 66d4222cb059f8b2f8cbadf21262133902c0df3f
    }
}