package xzh_7_24_ArrayTest1;

import java.lang.reflect.Array;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        
		int[] dims = new int[]{5,10,15};
		
		Object array = Array.newInstance(Integer.TYPE, dims);
		
		Object arrayObj = Array.get(array,3);
		
		Class<?> classType = array.getClass().getComponentType();
		
		System.out.println(classType);
		
		arrayObj = Array.get(arrayObj,5);
		
		Array.setInt(arrayObj,10,50);
		
		int[][][] arrayCast = (int[][][])array;
		
		System.out.println(arrayCast[3][5][10]);
	}

}
