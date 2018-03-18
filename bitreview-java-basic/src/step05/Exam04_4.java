package step05;

import java.util.ArrayList;

public class Exam04_4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(3.14f);
        list.add(true);
        list.add(365);

        for(int i = 0; i < list.size(); i++) 
            System.out.println(list.get(i));

        System.out.println("====================");

        for(Object value : list)
            System.out.println(value);
    }
}