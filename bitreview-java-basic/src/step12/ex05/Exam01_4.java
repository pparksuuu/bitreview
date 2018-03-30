package step12.ex05;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Exam01_4 {
    public static void main(String[] args) {
        String v1 = new String("aaa");
        String v2 = new String("bbb");
        String v3 = new String("ccc");
        String v4 = new String("ddd");
        String v5 = new String("ccc");   
        
        ArrayBlockingQueue queue = new ArrayBlockingQueue(100);
        
        queue.add(v1);
        queue.add(v2);
        queue.add(v3);
        queue.add(v4);
        queue.add(v5); 
        
        Object[] values = queue.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        
        Iterator getOut = queue.iterator();
        
        while(getOut.hasNext()) {
            System.out.print(getOut.next() + ", ");
        }
        System.out.println();
        
        
        
        
        }
    static void print(ArrayBlockingQueue queue) {
        Object[] values = queue.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
