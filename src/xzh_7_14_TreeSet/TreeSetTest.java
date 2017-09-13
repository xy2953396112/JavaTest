package xzh_7_14_TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet ta = new  TreeSet(new MyComparator());
     
	  ta.add("b");
	  ta.add("a");
	  ta.add("d");
	  ta.add("c");
		
	  for(Iterator iter=ta.iterator();iter.hasNext();){
		 String value = (String)iter.next();
		 System.out.println(value);
		 
	  }
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return s2.compareTo(s1);
	}
	
	
	
	
	
	
	
}
