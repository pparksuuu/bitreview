// ?Å¥?ùº?ù¥?ñ∏?ä∏ + ?Ç§Î≥¥Îìú ?ûÖ?†•
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
            // ?Ç§Î≥¥Îìú ?ûÖ?†•?ùÑ Î∞õÏïÑ?Ñú ?ÑúÎ≤ÑÏóêÍ≤? ?†Ñ?Ü°?ïú?ã§.
            System.out.print("Input> ");
            String input = keyScan.nextLine();
            out.println(input);

            // ?ÑúÎ≤ÑÍ? Î≥¥ÎÇ∏ ?ç∞?ù¥?Ñ∞Î•? ?àò?ã†?ïú?ã§.
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





