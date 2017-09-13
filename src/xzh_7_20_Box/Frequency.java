package xzh_7_20_Box;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Map<String,Integer> map = new HashMap<String,Integer>();
         
         for(String i : args){
        	 
        	 map.put(i, (null == map.get(i)) ? 1 : map.get(i)+1);
         }
         
         System.out.println(map);
	}

}
