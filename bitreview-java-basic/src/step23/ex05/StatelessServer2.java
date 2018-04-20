package step23.ex05;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

//stateless 방식의 특징
// => 요청 할 때마다 서버와 연결. 응답 받은 후 서버와의 연결을 끊는다.
// => 요청자를 구분할 수 없어 클라이언트의 작업 결과를 보관할 수 없다.
public class StatelessServer2 {
    static int countClient = 0;
    static HashMap<Integer,Integer> sessionMap = new HashMap<>();
    
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중");
        
        ServerSocket ss = new ServerSocket(8888);
        
        while (true) {
            Socket socket = ss.accept();
            System.out.println("클라이언트 연결 승인 및 작업 처리 중");
            processRequest(socket);
        }
    }
    
    static void processRequest(Socket socket) throws Exception {
        try (
                Socket socket2 = socket;
                PrintStream out = new PrintStream(socket.getOutputStream());
                Scanner in = new Scanner(socket.getInputStream());
                ) {
            String str = in.nextLine();
            int clientId = Integer.parseInt(in.nextLine());
            
            if (str.equals("")) {
                out.println("결과 = " + sessionMap.get(clientId));
                return;
            }
            
            if (clientId == 0) {
                clientId = ++countClient;
                sessionMap.put(clientId, 0);
            }
            
            int value = Integer.parseInt(str);
            int sum = sessionMap.get(clientId);
            
            sessionMap.put(clientId, sum + value);
            
            out.printf("%d\n", clientId);
        }
        
    }
    
}
