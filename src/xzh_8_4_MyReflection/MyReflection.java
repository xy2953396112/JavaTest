package xzh_8_4_MyReflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		MyTest mt = new  MyTest();
		
		Class<MyTest> classType = MyTest.class;
		
		Method  method = classType.getMethod("output",new Class[]{});
		
		if(method.isAnnotationPresent(MyAnnotation.class)){
			
			method.invoke(mt, new Object[]{});
			
			MyAnnotation ma = method.getAnnotation(MyAnnotation.class);
			
			String hello = ma.hello();
			
			String world = ma.world();
			
			System.out.println(hello+","+world);
		}
		
		Annotation[] mi = method.getAnnotations();
		
		for(Annotation an : mi){
			
			System.out.println(an);
		}
		
        for(Annotation an : mi){
			
			System.out.println(an.annotationType().getName());
		}
	}

}
