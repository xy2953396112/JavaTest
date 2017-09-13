package xzh_8_10_Clone;

public class CloneTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
           Teacher teacher = new  Teacher();
           
           teacher.setAge(55);
           
           teacher.setName("Ðì³¯êÍ");
           
           Student2 stu = new Student2();
           
           stu.setAge(22);
           
           stu.setName("xzh");
           
           stu.setTeacher(teacher);
           
           Student2 stu2 = (Student2) stu.clone();
           
           System.out.println(stu2.getAge());
           
           System.out.println(stu2.getName());
           
           System.out.println(stu2.getTeacher().getAge());
           
           System.out.println(stu2.getTeacher().getName());

	}

}

class Teacher implements Cloneable{
	
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

class Student2 implements Cloneable{
	
	private int age;
	
	private String name;
    
	private Teacher teacher;
	
	public int getAge() {
		return age;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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
