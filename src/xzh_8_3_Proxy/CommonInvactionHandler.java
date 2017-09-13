package xzh_8_3_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CommonInvactionHandler implements InvocationHandler {

	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}
	
	public CommonInvactionHandler(){
		   
	}
	
	public CommonInvactionHandler(Object target){
		   this.target = target;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		return method.invoke(target, args);  //target可以被认为是代理对象
	}

}
