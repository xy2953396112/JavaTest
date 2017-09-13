package xzh_7_25_Class;

public class ClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Class<?>  classType = child.class;
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
		
		classType = classType.getSuperclass();
		
		System.out.println(classType);
	}

}
class Parent{
	
}
class child extends Parent{
	
	
}