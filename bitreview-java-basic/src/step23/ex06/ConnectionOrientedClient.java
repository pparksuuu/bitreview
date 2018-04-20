package step23.ex06;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 연결 지향
// => 연결 후에 데이터를 송수신한다. 데이터 송수신에 대한 신뢰를 보장
// => TCP 통신 방법이 전형적인 예
public class ConnectionOrientedClient {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중...");
        
        ServerSocket ss = new ServerSocket(8888);
        
        Socket socket = ss.accept();
        System.out.println("클라이언트가 연결되었음!");
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        String str = in.nextLine();
        System.out.println("데이터 수신 완료!");
        
        out.print(str);
        System.out.println("데이터 송신 완료!");
        
        in.close();
        out.close();
        socket.close();
        System.out.println("클라이언트 연결 끊기!");
        
        ss.close();
        
        
    }
}
