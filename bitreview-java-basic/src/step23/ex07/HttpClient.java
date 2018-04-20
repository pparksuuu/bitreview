package step23.ex07;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// HTTP 요청 프로토콜
//=============================
// GET [자원주소] HTTP/1.1
// Host: [서버주소]
//
//==============================

public class HttpClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.itworld.co.kr",80);
        
        PrintStream out= new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        out.println("GET /news/108939 HTTP/1.1");
        out.println("Host: www.itworld.co.kr");
        out.println();
        
        while (true) {
            try {
                System.out.println(in.nextLine());
            } catch (Exception e) {
                break;
            }
        }
        
        out.close();
        in.close();
        socket.close();
    }
}
