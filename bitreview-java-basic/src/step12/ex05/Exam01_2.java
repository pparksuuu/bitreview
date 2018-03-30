package step12.ex05;

import java.util.Iterator;
import java.util.LinkedList;

public class Exam01_2 {
    public static void main(String[] args) {
        String v1 = new String("aaa");
        String v2 = new String("bbb");
        String v3 = new String("ccc");
        String v4 = new String("ddd");
        String v5 = new String("ccc");   
        
        LinkedList list = new LinkedList();
        
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5); 
        
        Object[] values = list.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        
        Iterator getOut = list.iterator();
        
        while(getOut.hasNext()) {
            System.out.print(getOut.next() + ", ");
        }
        System.out.println();
        
        
        
        
        }
    static void print(LinkedList list) {
        Object[] values = list.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
