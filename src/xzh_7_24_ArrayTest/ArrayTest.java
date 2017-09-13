package xzh_7_24_ArrayTest;

import java.lang.reflect.Array;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       
		Class<?> classType = Class.forName("java.lang.String");
		
		Object arr = Array.newInstance(classType,10);
		
		Array.set(arr,5,"Ðì³¯êÍ");
		
		String str = (String)Array.get(arr, 5);
		
		System.out.println(str);
	}

}
