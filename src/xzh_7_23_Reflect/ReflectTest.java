package xzh_7_23_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {

	public Object copy(Object object) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
	{
		Class<?> classType = object.getClass();
		
		System.out.println(classType);
		
		System.out.println(classType.getName());
		
		Constructor  con = classType.getConstructor(new Class[]{});
		Object ob = con.newInstance(new Object[]{});
		//以上两行代码=下边一行
		Object ob1 = classType.newInstance();
		System.out.println(ob);
		System.out.println(ob1);
		return null;
	}
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
        
		ReflectTest re = new ReflectTest();
		re.copy(new Customer());
	}

}

class Customer{
	
	String name;
	int age;
	
	public Customer()
	{
		
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