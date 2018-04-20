package step23.ex05;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//stateless 방식의 특징
// => 요청 할 때마다 서버와 연결. 응답 받은 후 서버와의 연결을 끊는다.
// => 요청자를 구분할 수 없어 클라이언트의 작업 결과를 보관할 수 없다.
public class StatelessClient2 {
    public static void main(String[] args) throws Exception {
        int clientId = 0;
        
        try (Scanner keyScan = new Scanner(System.in)) {
            while (true) {
                System.out.print("값? ");
                String value = keyScan.nextLine();
                
                try (
                        Socket socket = new Socket("localhost", 8888);
                        PrintStream out = new PrintStream(socket.getOutputStream());
                        Scanner in = new Scanner(socket.getInputStream());
                        ) {
                
                    out.println(value);
                    out.printf("%d\n", clientId);
                    
                    if (value.equals("")) {
                        System.out.println(in.nextLine());
                        break;
                    }
                       
                    clientId = Integer.parseInt(in.next());
                }
            }
        }
    }
    
}
