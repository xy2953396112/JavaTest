package xzh_8_13_Socket_Server;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
       
		Socket socket = new Socket("127.0.0.1",2000);
			
			new ClientInputThread(socket).start();
			new ClientOutputThread(socket).start();
			
		
	}

}
