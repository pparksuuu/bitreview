package step22.ex07;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream {
    
    InputStream in;
    
    byte[] buf = new byte[8196];
    int size; // 배열에 저장되어 있는 바이트의 수
    int cursor; // 바이트 읽은 배열의 위치
    
    public BufferedInputStream(InputStream in) {
        this.in = in;
    }
    
    public int read() throws IOException {
        if (cursor == size) {
            if ((size = in.read(buf)) == -1) {
                return -1;
            }
            cursor = 0;
        }
        return buf[cursor++] & 0x000000ff;
    }
    
    public void close() throws IOException {
        in.close();
    }
}
