package xzh_7_7_Iterator;

import java.util.HashSet;
public class Iterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashSet hs = new HashSet();
        
        hs.add("a");
        hs.add("b");              
        hs.add("c");
        hs.add("d");
        hs.add("e");
        
        System.out.println(hs);
        
        Iterator iter =   hs.iterator();
        
        while(iter.hashCode()){
        	
        	String name = iter.next();
        	
        	System.out.println(name);
        	
        }
	}

	

}
