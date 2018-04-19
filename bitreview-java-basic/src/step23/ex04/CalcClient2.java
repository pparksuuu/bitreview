package step23.ex04;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient2 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        
        while (true) {
            System.out.print("value1? ");
            int a = Integer.parseInt(keyScan.nextLine());
            System.out.print("operator? ");
            String op = keyScan.nextLine();
            System.out.print("value2? ");
            int b = Integer.parseInt(keyScan.nextLine());
            
            Socket socket = new Socket("localhost", 8888);
            Scanner in = new Scanner(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            
            out.writeInt(a);
            out.writeUTF(op);
            out.writeInt(b);
            
            String str = in.nextLine();
            System.out.println(str);
            
            in.close();
            out.close();
            socket.close();
            
        }
    }
}
