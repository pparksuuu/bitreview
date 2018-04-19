package step23.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender5 {
    public static void main(String[] args) throws Exception {
        File file = new File("temp/jls8.pdf");
        FileInputStream fileIn = new FileInputStream(file);
        
        System.out.println("Connecting Server...");
        Socket socket = new Socket("localhost", 8888);
        System.out.println("Server Connected!");
        
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));
        Scanner in = new Scanner(
                new BufferedInputStream(socket.getInputStream()));
        
        System.out.println("Sending the date to Server");
        
        long startTime = System.currentTimeMillis();
        
        out.writeLong(file.length());
        out.writeUTF(file.getName());
        
        int b;
        while ((b = fileIn.read()) != -1) {
            out.write(b);
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println(endTime - startTime);
        
        String response = in.nextLine();
        System.out.println(response);
        
        in.close();
        out.close();
        socket.close();
        fileIn.close();
    }
}
