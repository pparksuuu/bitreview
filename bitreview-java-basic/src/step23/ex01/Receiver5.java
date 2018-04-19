package step23.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Server is running...");
        
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        System.out.println("Client is connted!");
        
        PrintStream out = new PrintStream(
                new BufferedOutputStream(socket.getOutputStream()));
        
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));  
        
        System.out.println("Data is receiving from Client");
        
        long filesize = in.readLong();
        
        String filename = in.readUTF();
        
        File file = new File("temp/ok_" + filename);
        FileOutputStream fileOut = new FileOutputStream(file);
        
        for (long i = 0; i < filesize; i++) {
            fileOut.write(in.read());
        }
        System.out.println("Successfully data accepted");
        
        out.println("OK!");
        
        in.close();
        out.close();
        socket.close();
        serverSocket.close();
        fileOut.close();
    }
}
