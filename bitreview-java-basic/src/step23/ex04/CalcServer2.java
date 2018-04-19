package step23.ex04;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Server running...");

        ServerSocket ss = new ServerSocket(8888);

        while (true) {
            Socket socket = ss.accept();
            try {
                processRequest(socket);
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }

    static void processRequest(Socket socket) throws Exception {
        try(
                Socket socket2 = socket;
                DataInputStream in = new DataInputStream(socket.getInputStream());
                PrintStream out = new PrintStream(socket.getOutputStream());
                ) {

            l1: while (true) {
                int a = in.readInt();
                String op = in.readUTF();
                int b = in.readInt();
                int result = 0;

                switch(op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/": result = a / b; break;
                case "quit": break l1;
                }

                out.printf("%d %s %d = %d\n", a, op, b, result);
            }
        out.println("quit");

        }
    }
}
