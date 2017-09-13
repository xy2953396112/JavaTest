package xzh_8_12_Network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
          
		URL url = new URL("https://www.baidu.com/baidu?wd=%E6%9C%89%E5%8D%8F%E8%AE%AE%E7%9A%84%E7%BD%91%E5%9D%80&tn=monline_4_dg&ie=utf-8");
		
		String protocol = url.getProtocol();
		
		String host = url.getHost();
		
		int port = url.getPort();
		
		String path = url.getPath();
		
		String ref = url.getRef();
		
		System.out.println("protocol:"+protocol);
		System.out.println("host:"+host);
		System.out.println("port:"+port);
		System.out.println("path:"+path);
		System.out.println("ref:"+ref);
	}

}
