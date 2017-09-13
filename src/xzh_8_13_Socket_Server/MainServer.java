package xzh_8_13_Socket_Server;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
		ServerSocket ss = new ServerSocket(2000);
		
		while(true){
			
			Socket socket = ss.accept();
			
			new ServerInputThread(socket).start();
			new ServerOutputThread(socket).start();
			
		}
	}

}
