package xzh_6_30_SetTest;

import java.util.HashSet;

public class SetTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       HashSet hs = new HashSet();
       hs.add(new People("one"));
       hs.add(new People("second"));
       hs.add(new People("one"));
       System.out.println(hs);
       
       People p1 =  new People("xzh");
       People p2 =  new People("xzh");
       System.out.println(p1);
       System.out.println(p2);
	}

}
class People{
	String name;
	
	public People(String name){
		
		this.name = name; 
		
	}
	
	public int hashCode(){
		return this.name.hashCode();
		
	}
	
	public boolean equals(Object obj){
		
		if(this == obj){
			return true;
		}
		
		if(null != obj && obj instanceof People){
			People s = (People)obj;
			
			if(name.equals(s.name)){
				
				return true;
			}
		}
		return false;
	}
	
	
	
}
