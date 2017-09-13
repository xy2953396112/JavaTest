package xzh_7_14_Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList  lel =  new LinkedList();
        
        lel.add(new Integer(-3));
        lel.add(new Integer(5));
        lel.add(new Integer(2));
        lel.add(new Integer(-1));
        
        Comparator cp = Collections.reverseOrder();               //Ïà·´µÄË³Ðò
        Collections.sort(lel,cp);
        
        for(Iterator iter=lel.iterator();iter.hasNext();){
   		 //String value = (String)iter.next();
   		 System.out.println(iter.next());
   		 
   	  }
        Collections.shuffle(lel);                             //ÂÒÐò
        for(Iterator iter=lel.iterator();iter.hasNext();){
      		 //String value = (String)iter.next();
      		 System.out.println(iter.next());
      		 
      	  }
        System.out.println("Min is :"+Collections.min(lel)); 
        System.out.println("Max is :"+Collections.max(lel));
	}

}
