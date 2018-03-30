package step12.ex05;

import java.util.HashSet;
import java.util.Iterator;

public class Exam01_1 {
    public static void main(String[] args) {
        String v1 = new String("aaa");
        String v2 = new String("bbb");
        String v3 = new String("ccc");
        String v4 = new String("ddd");
        String v5 = new String("ccc");   
        
        HashSet set = new HashSet();
        
        set.add(v1);
        set.add(v2);
        set.add(v3);
        set.add(v4);
        set.add(v5); 
        
        Object[] values = set.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        
        Iterator getOut = set.iterator();
        
        while(getOut.hasNext()) {
            System.out.print(getOut.next() + ", ");
        }
        System.out.println();
        
        
        
        
        }
    static void print(HashSet set) {
        Object[] values = set.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
