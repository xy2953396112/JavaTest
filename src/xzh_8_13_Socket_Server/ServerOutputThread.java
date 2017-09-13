package xzh_8_13_Socket_Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerOutputThread extends Thread {
     
	private Socket socket;
	
	public ServerOutputThread(Socket socket){
		
		this.socket = socket;
	}
	
	public void run(){
		
	 while(true){
		OutputStream os = null;
		try {
			os = socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		try {
			line = bb.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			os.write(line.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}
}
