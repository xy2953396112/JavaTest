package xzh_7_16_Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;



public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
          Map  map = new  TreeMap();
          
          Random random = new Random();
          
          for(int i=0;i<50;i++){
        	  
        	  int number = random.nextInt(41)+10;
        	  
        	  Integer in = new Integer(number);
        	  
        	  if(map.get(in) == null){
            	  
        		  map.put(in, new Integer(1));
        		  
              }else{
            	  
            	  int value = ((Integer)map.get(in)).intValue();
            	  
            	  map.put(in, new Integer(value+1));
              }
          }
          
          Collection coll = map.values();
          
          Integer count = (Integer)Collections.max(coll);
          
          Set set = map.entrySet();                      //
          
          List list = new ArrayList();
          
         for(Iterator iter = set.iterator(); iter.hasNext();){
        	  
        	  Map.Entry  entry = (Entry)iter.next();
        	  
        	  Integer key = (Integer)entry.getKey();
        	  Integer value = (Integer)entry.getValue();
        	  
        	  System.out.println(key.intValue()+" : "+value);
        	  
        	  if(value.intValue() == count.intValue()){
        		  
        		  list.add(key);
        		  
        	  }
          }
          
          
          
          System.out.println("maxCount is:"+count);
          
          System.out.println("The maxCount are :");
          
         for(Iterator iter = list.iterator(); iter.hasNext();){
        	  
        	  Integer in = (Integer)iter.next();
        	  
        	  System.out.print(in+" ");
        	  
        	 
          }
         
	}

}
