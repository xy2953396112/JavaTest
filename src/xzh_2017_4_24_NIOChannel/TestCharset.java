package xzh_2017_4_24_NIOChannel;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCharset {
      public static void main(String[] args) {
		
    	Map<String,Charset> map = Charset.availableCharsets();
    	Set<Entry<String,Charset>> set = map.entrySet();
    	
    	for(Entry<String,Charset> entry:set){
    		System.out.println(entry.getKey()+":"+entry.getValue());
    	}
	}
}
