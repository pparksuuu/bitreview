// ?��?��?��?��?�� + ?��보드 ?��?��
package step23.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender3 {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);

        Socket socket = new Socket("localhost", 8888);

        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());

        while (true) {
            // ?��보드 ?��?��?�� 받아?�� ?��버에�? ?��?��?��?��.
            System.out.print("Input> ");
            String input = keyScan.nextLine();
            out.println(input);

            // ?��버�? 보낸 ?��?��?���? ?��?��?��?��.
            String str = in.nextLine();
            System.out.println(str);

            if (str.equals("quit"))
                break;

        }
        in.close();
        out.close();
        socket.close();
        keyScan.close();
    }

}





