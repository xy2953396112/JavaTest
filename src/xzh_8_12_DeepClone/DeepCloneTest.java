package xzh_8_12_DeepClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepCloneTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
       
		Teacher t = new Teacher();
		
		t.setAge(22);
		t.setName("Ðì³¯êÍ");
		
		Student s = new Student();
		
		s.setAge(18);
		s.setName("xzh");
		s.setTeacher(t);
		
		Student s2 = (Student) s.deepCopy();
	
		System.out.println(s2.getAge());
		
		System.out.println(s2.getName());
		
		System.out.println(s2.getTeacher());
		
		System.out.println("----------------------");
		
		System.out.println(s2.getTeacher().getAge());
		
		System.out.println(s2.getTeacher().getName());
		
		System.out.println("----------------------");
		
		s2.getTeacher().setAge(100);
		
		s2.getTeacher().setName("xuxuxuxuuxuxuuxuxuxuuxuxuxuxu");
		
        System.out.println(s.getTeacher().getAge());
		
		System.out.println(s.getTeacher().getName());
	}

}

class Teacher implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

}

class Student implements Serializable{
	
	private int age;
	
	private String name;
	
	private Teacher teacher;
	
	/*public Student(Teacher teacher){
		
		this.teacher = teacher;
	}*/

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Object deepCopy() throws IOException, ClassNotFoundException{
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		
		ObjectInputStream oio = new ObjectInputStream(bis);
		
		return oio.readObject();
		
		
		
	}
	
	
}

