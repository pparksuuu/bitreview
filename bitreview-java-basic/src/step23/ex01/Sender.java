package step23.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",8888);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        out.println("Hello, I'm sender");
        
        String str = in.nextLine();
        System.out.println(str);
        
        out.close();
        in.close();
        socket.close();
    }   
}
