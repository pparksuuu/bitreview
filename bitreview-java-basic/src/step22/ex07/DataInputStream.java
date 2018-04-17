package step22.ex07;

import java.io.IOException;
import java.io.InputStream;

public class DataInputStream extends InputStream {
    InputStream in;
    public DataInputStream(InputStream in) {
        this.in = in;
    }
    
    public String readUTF() throws Exception {
        byte[] bytes = new byte[100];
        int size = in.read();
        in.read(bytes, 0, size);
        return new String(bytes, 0, size, "UTF-8");
    }
    
    public int readInt() throws Exception {
        int value = 0;
        
        value = in.read() << 24;
        value += in.read() << 16;
        value += in.read() << 8;
        value += in.read();
        return value;
    }
    
    public long readLong() throws Exception {
        long value = 0;
        
        value = (long)in.read() << 56;
        value += (long)in.read() << 48;
        value += (long)in.read() << 40;
        value += (long)in.read() << 32;
        value += (long)in.read() << 24;
        value += (long)in.read() << 16;
        value += (long)in.read() << 8;
        value += (long)in.read();
        return value;
    }
    
    public boolean readBoolean() throws Exception {
        if (in.read() == 1)
            return true;
        else
            return false;
    }
    
    @Override
    public void close() throws IOException {
        in.close();
    }

    @Override
    public int read() throws IOException {
        return in.read();
    }
}
