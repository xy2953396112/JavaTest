package xzh_8_13_Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		ServerSocket ss = new ServerSocket(1000);
		
		Socket socket = ss.accept();
		
		InputStream is = socket.getInputStream();
		
		byte[] buffer = new byte[2048];
		
		int length = 0;
		
		
		length = is.read(buffer,0,buffer.length);
			
		System.out.println(new String(buffer,0,length));
		
		OutputStream os = socket.getOutputStream();
		
		os.write("world".getBytes());
		
		is.close();
		os.close();
		socket.close();
		
	}

}
