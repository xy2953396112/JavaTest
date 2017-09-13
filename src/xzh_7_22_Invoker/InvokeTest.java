package xzh_7_22_Invoker;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTest {

	public int add(int param1,int param2)
	{
		return param1 + param2;
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
      
		Class<?> classType = InvokeTest.class;
		
		Object invokeTest = classType.newInstance();
		
		System.out.println(invokeTest instanceof InvokeTest);
		
		Method addMethod = classType.getMethod("add",new Class[]{int.class,int.class});
		
		Object result = addMethod.invoke(invokeTest,new Object[]{1,2});
		
		System.out.println(result);
	}

}
