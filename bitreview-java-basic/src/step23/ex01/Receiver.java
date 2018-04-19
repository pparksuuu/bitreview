package step23.ex01;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver {
    public static void main(String[] args) throws Exception {
        
        ServerSocket serverSocket = new ServerSocket(8888);
        
        Socket socket = serverSocket.accept();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        String str = in.nextLine();
        System.out.printf("Sender> %s\n", str);
        
        out.printf("Hello, I'm SUHYEON");
        
        in.close();
        out.close();
        
        
    }
}
