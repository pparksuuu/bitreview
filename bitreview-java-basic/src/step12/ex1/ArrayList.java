package step12.ex1;

public class ArrayList {
<<<<<<< HEAD
     static int DEAULT_CAPACITY = 5;
}
=======
    protected static final int DEFAULT_CAPACITY = 5;
    Object[] list;
    int cursor;
    
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayList(int capacity) {
        if (capacity < DEFAULT_CAPACITY) {
            list = new Object[DEFAULT_CAPACITY];
        } else {
            list = new Object[capacity];
        }
    }
    
    public void add(Object value) {
        if (cursor >= list.length) {
            this.increaseArray();
        } 
        list[cursor++] = value;
  
    }

    public void add(int index, Object value) {
        if (index < 0 || index > cursor) {
            return;
        }
        
        if (cursor >= list.length) {
            this.increaseArray();
        }
        
        for (int i = cursor; i > index; i--) {
            list[i] = list[i-1];
        }
        list[index] = value;
        cursor++;
    }
    
    public void set(int index, Object value) {
        if (index < 0 || index >= cursor) {
            return;
        }
        
        list[index] = value;
    }
    
    private void increaseArray() {
        Object[] list2 = new Object[list.length + DEFAULT_CAPACITY];
        for (int i = 0; i < list.length; i++) {
            list2[i] = list[i];
        }
        list = list2;
    }
    
    public void remove(int index) {
        if (index < 0 || index >= cursor) {
            return;
        }
        
        for (int i = index + 1; i < cursor ; i++) {
            list[i - 1] = list[i];
        }
        cursor--;
    }
    
    public Object get(int index) {
        return list[index];
    }
    
    public int size() {
        return cursor;
    }
    
    public boolean contains(Object value) {
        for (Object obj : list) {
            if(obj.equals(value))
                return true;
        }
        return false;
    }
    
}
>>>>>>> branch 'master' of https://github.com/pparksuuu/bitreview.git
