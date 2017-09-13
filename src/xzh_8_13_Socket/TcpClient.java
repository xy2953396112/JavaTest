package xzh_8_13_Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
     
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket ss = new Socket("127.0.0.1",1000);
		
		OutputStream os = ss.getOutputStream(); 
		
		os.write("hello world".getBytes());
			
		InputStream is = ss.getInputStream();
		
		byte[] buffer = new byte[2048];
		
		int length = 0;
		
		
		while(-1 != (length = is.read(buffer,0,buffer.length))){
			
			String str = new String(buffer,0,length);

			System.out.println(str);
		}
		
		is.close();
		os.close();
		ss.close();	
		}
	}

