package xzh_8_3_SuppressWarning;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class SuppressWarningsTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

         Map map = new TreeMap();
 
         map.put("date", new Date());
         
         System.out.println(map.get("date"));
	}

}
