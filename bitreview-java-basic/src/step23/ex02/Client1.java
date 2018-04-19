package step23.ex02;

import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Connecting server...");
        
        Socket socket = new Socket("localhost",8888);
        
        System.out.println("Server connected!");
        
        socket.close();
    }
}
