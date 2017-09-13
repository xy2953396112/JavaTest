package xzh_8_3_Proxy;

import java.lang.reflect.Proxy;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		CommonInvactionHandler handler = new CommonInvactionHandler();
		
		Foo foo = null;
		
		handler.setTarget(new FooImpl1());
		
		foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[]{Foo.class}, handler);
		
		foo.doAction();
		
		System.out.println("------------------------------------------------");
		
		handler.setTarget(new FooImpl2());
		
		foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[]{Foo.class}, handler);
		
		foo.doAction();
		
	}

}
