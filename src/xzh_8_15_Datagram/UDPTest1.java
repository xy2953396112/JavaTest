package xzh_8_15_Datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPTest1 {
   
	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		
		String str = "hello world";
		
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("localhost"),2000);
		
		ds.send(dp);
		
		byte[] buffer = new byte[1024];
		
		DatagramPacket dst = new DatagramPacket(buffer,100);
		
		ds.receive(dst);
		
		System.out.println(new String(buffer,0,dst.getLength()));
		
		ds.close();
	}
}
