package xzh_8_6_CharSet;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

public class CharSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        
		SortedMap<String,Charset> map = Charset.availableCharsets();
		
		Set<String> set = map.keySet();
		
		for(Iterator<String> iter=set.iterator();;iter.hasNext()){
			
			System.out.println(iter.next());
		}
	}

}
