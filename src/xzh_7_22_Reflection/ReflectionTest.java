package xzh_7_22_Reflection;

import java.lang.reflect.Method;

public class ReflectionTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
        
		//Class<?>  classType = Class.forName("java.lang.String");
		Class<?>  classType = Class.forName(args[0]);
		
		Method[] methods = classType.getDeclaredMethods();
		
		for(Method method : methods)
		{
			System.out.println(method);
		}
	}

}
