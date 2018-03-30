package step12.ex04;

import step12.ex02.LinkedList;

public class Queue extends LinkedList {
    public void offer(Object value) {
        this.add(value);
    }
    
    public Object poll() {
        return remove(0);
    }
}
