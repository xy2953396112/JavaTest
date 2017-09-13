package xzh_8_13_INetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class INetAddress {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
         
	  InetAddress ia = InetAddress.getLocalHost();
	  
	  System.out.println(ia);
	  
	  ia = InetAddress.getByName("www.baidu.com");
	  
	  System.out.println(ia);
		
	}

}
