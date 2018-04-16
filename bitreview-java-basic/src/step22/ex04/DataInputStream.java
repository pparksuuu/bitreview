package step22.ex04;

import java.io.FileInputStream;

public class DataInputStream extends FileInputStream {
    public DataInputStream(String filename) throws Exception {
        super(filename);
    }
    
    public String readUTF() throws Exception {
        byte[] bytes = new byte[100];
        int size = this.read();
        this.read(bytes, 0, size);
        return new String(bytes, 0, size, "UTF-8");
    }
    
    public int readInt() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 int 값 출력
        int value = 0;
        
        value = this.read() << 24;
        value += this.read() << 16;
        value += this.read() << 8;
        value += this.read();
        return value;
    }
    
    public long readLong() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 long 값 출력
        long value = 0;
        value += (long)this.read() << 56;
        value += (long)this.read() << 48;
        value += (long)this.read() << 40;
        value += (long)this.read() << 32;
        value += (long)this.read() << 24;
        value += (long)this.read() << 16;
        value += (long)this.read() << 8;
        value += (long)this.read();
        return value;
    }
    
    public boolean readBoolean() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 boolean 값 출력
        if (this.read()==1) 
            return true;
        else 
            return false;
    }
}
