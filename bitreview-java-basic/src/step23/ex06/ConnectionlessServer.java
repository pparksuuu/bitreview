package step23.ex06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ConnectionlessServer {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중...");
        
        // 특정 포트로 들어온 데이터를 받을 서버 소켓 준비
        DatagramSocket socket = new DatagramSocket(8888);
        
        byte[] buf = new byte[8196];
        
        DatagramPacket emptyPacket = new DatagramPacket(buf, buf.length);
        
        socket.receive(emptyPacket);
        
        socket.close();
        
        String message = new String(
                emptyPacket.getData(), 0, emptyPacket.getLength(), "UTF-8");
        System.out.println(message);
    } 
}
