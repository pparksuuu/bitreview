package step12.ex03;

import step12.ex02.LinkedList;

public class Stack extends LinkedList {
    public void push(Object value) {
        this.add(value);
    }
    
    public Object pop() {
        if (head == tail) {
            return null;
        }
        
        Bucket removedBucket = this.tail.prev;
        if (tail.prev.prev != null) {
            tail.prev.prev.next = tail;
            tail.prev = tail.prev.prev;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removedBucket.value;
    }
}
