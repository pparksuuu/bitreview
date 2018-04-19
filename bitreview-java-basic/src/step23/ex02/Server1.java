package step23.ex02;

import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Server Running,,,");
        
        ServerSocket ss = new ServerSocket(8888);
        
        System.out.println("Waiting for a client's connecting");
        
        Socket socket = ss.accept();
        
        System.out.println("Connection acception one of a waiting clients ");
        
        socket.close();
        ss.close();
        
    }
}
