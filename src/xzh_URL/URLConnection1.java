package xzh_URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class URLConnection1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		URL url = new URL("http://WWW.baidu.com");
		
		URLConnection uc = url.openConnection();
		
		InputStream is = uc.getInputStream();
		
		OutputStream os = new FileOutputStream("e:\\1.txt");
		
		byte[] buffer = new byte[1024];
		
		int length = 0;
		
		while(-1 != (length = is.read(buffer,0,buffer.length))){
			
			os.write(buffer,0,length);
		}
		
		is.close();
		os.close();
	}

}
