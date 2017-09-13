package xzh_8_7_SerializableTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        
		Person p1 = new Person(1,"Ðì³¯êÍ",175.5);
		
		Person p2 = new Person(2,"xzh",175.6);
		
		FileOutputStream fos = new FileOutputStream("xzh.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		
		oos.writeObject(p2);
		
		oos.close();
		
		System.out.println("-----------------------------------------");
		
		FileInputStream fis = new FileInputStream("xzh.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p = null;
		
		for(int i=0;i<2;i++){
			
			p = (Person)ois.readObject();
			
			System.out.println(p.age+","+p.name+","+p.height);
		}
		
		ois.close();
	}

}

class Person implements Serializable{
	
	int age;
	
	String name;
	
	double height;
	
	public Person(int age,String name,double height){
		
		this.age = age;
		this.name = name;
		this.height = height;
	}
	
	private void writeObject(java.io.ObjectOutputStream out) throws Exception{
		
		out.writeInt(age);
		out.writeUTF(name);
		
		
		System.out.println("writeObject");
	}
	
	private void readObject(java.io.ObjectInputStream in) throws Exception{
		
		age = in.readInt();
	    name = in.readUTF();
		
		System.out.println(age+"   "+name);
		System.out.println("readObejct");
	}
	
	
	
}