package xzh_7_25_Proxy;

public class Client {
     //¾²Ì¬´úÀí
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        Subject subject = new ProxySubject();
        
        subject.request();
	}

}
