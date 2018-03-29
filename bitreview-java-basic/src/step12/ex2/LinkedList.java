package step12.ex2;

public class LinkedList {
    /*
     * 값을 저장할 바구니 클래스를 만든다
     * 그 클래스는 LinkedList에서만 사용할 것이기 떄문에
     * 일반적인 클래스인 패키지 멤버 클래스로 정의하지 않고 
     * LinkedList 안에 정의한다.
     * 이렇게 클래스 안에 정의된 클래스를 '중첩 클래스(nested class)' 또는
     * '내부 클래스(inner class)'라 부른다.
     * */
    class Bucket {
        Object value;
        Bucket next;
        Bucket prev;
    }
    
    Bucket head;
    Bucket tail;
    
    public LinkedList() {
        head = new Bucket();
        tail = head;
    }
    
    public void add(Object value) {
        tail.value = value;
        
        Bucket bucket = new Bucket();
        tail.next = bucket;
        
        bucket.prev = tail;

        tail = bucket;
    }
    
    public Object get(int i) {
        Bucket cursor = head;
        int count = 0;

        while (cursor != tail) {
            if (count == i) {
                return cursor.value;
            }
            count++;
            cursor = cursor.next;
        }
        return null;
    }
    
    public int size() {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) {
            count++;
            cursor = cursor.next;
        }
        return count;
    }
    
    public Object remove(int i) {
        Bucket cursor = head;
        
        if (i == 0) {
            if (head == tail) {
                return null;
            } else {
                head = head.next;
                head.prev = null;
                return cursor.value;
            }
        }
        
        int count = 0;
        
        while (cursor != tail) {
            if (count == i) {
                cursor.prev.next = cursor.next;
                cursor.next.prev = cursor.prev;
                return cursor.value;
            }
            count++;
            cursor = cursor.next;
        }
        return null;
    }
    
    public void add (int i, Object value) {
        Bucket cursor = head;
        int count = 0;
        
        while (cursor != tail) {
            if (count == i) {
                Bucket bucket = new Bucket();
                bucket.value = value;
                bucket.prev = cursor.prev;
                cursor.prev = bucket;
                bucket.next = cursor;
                if (bucket.prev != null) {
                    bucket.prev.next = bucket;
                } else {
                    head = bucket;
                }
            }
            count++;
            cursor = cursor.next;
        }
        
        if (count == i) {
            add(value);
        }
    }
}
