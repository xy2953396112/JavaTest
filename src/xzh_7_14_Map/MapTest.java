package xzh_7_14_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap hm = new HashMap();
         
         for(int i=0;i<args.length;i++){
        	 if(hm.get(args[i])==null){
        		 hm.put(args[i], new Integer(1));
        	 }else{
        		 Integer in = (Integer)hm.get(args[i]);
        		 in = new Integer(in.intValue()+1);
        		 hm.put(args[i], in);
        	 }
         }
         
         Set set = hm.keySet();
         
         for(Iterator iter=set.iterator();iter.hasNext();){
        	 String key = (String) iter.next();
        	 Integer value = (Integer)hm.get(key);
        	 System.out.println(key+":"+value);
        	 
        	 
        	 
         }
         
	}

}
