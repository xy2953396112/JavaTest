package xzh_7_31_VectorProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class VectorProxy implements InvocationHandler {

    private  Object proxyObj;
    
    public  VectorProxy(Object proxyObj){
    	this.proxyObj = proxyObj;
    }
    
    public static Object factory(Object obj){
    	
    	Class<?> classType = obj.getClass();
    	
    	return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), new VectorProxy(obj));
    }
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before£º"+method);
		
		if(args != null){
			for(Object obj : args ){
				System.out.println(obj);
			}
		}
		
		Object object = method.invoke(proxyObj, args);
		
		System.out.println("after£º"+method);
		
		return object;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 List list = (List)factory(new Vector());
		 
		 System.out.println(list.getClass().getName());
		 
		 list.add("Ðì³¯êÍ");
		 list.add("xzh");
		 
		 System.out.println(list);
	}

}
