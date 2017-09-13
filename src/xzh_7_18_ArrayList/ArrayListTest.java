package xzh_7_18_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ArrayList<String> list = new ArrayList<String>();
      
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        for(int i = 0;i<list.size();i++)
        {
        	String value = list.get(i);
        	System.out.println(value);
        }
        
        for(Iterator<String> iter=list.iterator();iter.hasNext();)
        {
        	String value = iter.next();
        	System.out.println(value);
        }
	}

}
