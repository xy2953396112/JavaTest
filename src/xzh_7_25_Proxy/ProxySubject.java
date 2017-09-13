package xzh_7_25_Proxy;

public class ProxySubject extends Subject {

	private RealSubject realSubject;
	public void request() {
		this.pre();
		if(realSubject  == null){
			realSubject = new RealSubject();
		}
		realSubject.request();
		this.post();
	}
	public void pre(){
		System.out.println("pre request");
	}
	public void post(){
		System.out.println("post request");
	}

}
