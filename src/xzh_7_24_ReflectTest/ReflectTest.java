package xzh_7_24_ReflectTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {

	public Object copy(Object object) throws Exception
	{
		Class<?> classType = object.getClass();
		
		Object objectCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[]{});
		
		Field[] fields = classType.getDeclaredFields();
		
		for(Field field : fields ){
			 
			System.out.println(field);
		}
		for(Field field : fields ){
			
			String name = field.getName();
			
			String firstLetter = name.substring(0,1).toUpperCase();
			
			String getMethodName = "get"+firstLetter+name.substring(1);
			String setMethodName = "set"+firstLetter+name.substring(1);
			
			Method getMethod = classType.getMethod(getMethodName,new Class[]{});
			Method setMethod = classType.getMethod(setMethodName,new Class[]{ field.getType()});
		
		    Object value = getMethod.invoke(object,new Object[]{});

		    setMethod.invoke(objectCopy,new Object[]{ value});
		}
		
		return objectCopy;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ReflectTest rt = new ReflectTest();
		
		Customer cu = (Customer) rt.copy(new Customer("xzh",22));
		
		System.out.println(cu.getName()+","+cu.getAge());
		 
	}

}
class Customer{
	
	String name;
	int age;
	
	public Customer()
	{
		
	}
	public Customer(String name,int age){
		this.name=name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}