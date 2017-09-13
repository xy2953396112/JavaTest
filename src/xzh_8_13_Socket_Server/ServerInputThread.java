package xzh_8_13_Socket_Server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerInputThread extends Thread{
    
	private Socket socket;
	
	public ServerInputThread(Socket socket){
		
		this.socket = socket;
	}
	
	public void run(){
		
		while(true){
		
		InputStream is = null;
		try {
			is = socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] buffer = new byte[1024];
		
		int length = 0;
		try {
			length = is.read(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = new String(buffer,0,length);
		
		System.out.println(str);
		}
	}
	
}
