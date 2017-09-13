package xzh_8_15_Datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPTest2 {
    
	public static void main(String[] args) throws IOException {
	   
		DatagramSocket socket = new DatagramSocket(2000);
		
		byte[] buffer = new byte[1024];
		
		DatagramPacket packet = new DatagramPacket(buffer,1024);
		
		socket.receive(packet);
		
		System.out.println(new String(buffer,0,packet.getLength()));
		
		String str = "welcome";
		
		DatagramPacket packet2 = new DatagramPacket(str.getBytes(),str.length(),packet.getAddress(),packet.getPort());
		
		socket.send(packet2);
		
		socket.close();
	}
}
