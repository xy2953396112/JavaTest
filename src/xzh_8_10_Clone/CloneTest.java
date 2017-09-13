package xzh_8_10_Clone;

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Student stu = new Student();
		
		stu.setAge(22);
		
		stu.setName("Ðì³¯êÍ");
		
		Student stu2 = (Student) stu.clone();
		
		System.out.println(stu2.getAge());
		
		System.out.println(stu2.getName());
		
		System.out.println("---------------------------------------");
		
		stu2.setName("xzh");
		
		System.out.println(stu.getName());
		
		System.out.println(stu2.getName());
	}

}

class Student implements Cloneable{
	
	private int age;
	
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone(){
		
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return object;
	} 
	
	
	
	
	
	
}
