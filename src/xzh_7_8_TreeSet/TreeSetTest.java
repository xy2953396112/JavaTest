package xzh_7_8_TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TreeSet ts = new TreeSet(new MyComparator());
          Person p1 = new Person(1);
          Person p2 = new Person(2);
          Person p3 = new Person(3);
          Person p4 = new Person(4);
          Person p5 = new Person(5);
          ts.add(p1);
          ts.add(p2);
          ts.add(p3);
          ts.add(p4);
          ts.add(p5);
         
          for(Iterator iter=ts.iterator();iter.hasNext();){
        	  Person p = (Person)iter.next();
        	  System.out.println(p.score);
          }
	}
    
}
class Person{
	int score;
	
	public Person(int score){
		this.score = score;
	}
	public String toString(){
		
		return  String.valueOf(this.score);
	}
	
	
	
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Person s1 = (Person)o1;
		Person s2 = (Person)o2;
		
		return s1.score-s2.score;
		
	}
	
	
	
	
	
	
	
}
