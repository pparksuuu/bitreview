package step12.ex05;

import java.util.Iterator;
import java.util.Stack;

public class Exam01_3 {
    public static void main(String[] args) {
        String v1 = new String("aaa");
        String v2 = new String("bbb");
        String v3 = new String("ccc");
        String v4 = new String("ddd");
        String v5 = new String("ccc");   
        
        Stack stack = new Stack();
        
        stack.add(v1);
        stack.add(v2);
        stack.add(v3);
        stack.add(v4);
        stack.add(v5); 
        
        Object[] values = stack.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        
        Iterator getOut = stack.iterator();
        
        while(getOut.hasNext()) {
            System.out.print(getOut.next() + ", ");
        }
        System.out.println();
        
        
        
        
        }
    static void print(Stack stack) {
        Object[] values = stack.toArray();
        for (Object value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
