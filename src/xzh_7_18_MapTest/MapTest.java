package xzh_7_18_MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
       
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		
		Set<String> set = map.keySet();
		
		for(Iterator<String> iter=set.iterator();iter.hasNext();)
		{
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
		
		Set<Map.Entry<String, String>> set1 = map.entrySet();
		for(Iterator<Map.Entry<String,String>> iter=set1.iterator();iter.hasNext();)
		{
			Entry<String, String> entry = iter.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}

}
