package xzh_7_18_Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		Properties pro = System.getProperties();
		
		Set set = pro.keySet();
		
		for(Iterator iter = set.iterator();iter.hasNext();)
		{
			String key = (String)iter.next();
			//String value = (String)pro.get(key);
			String value = pro.getProperty(key);
			
			System.out.println(key+" : "+value);
		}
	}

}
