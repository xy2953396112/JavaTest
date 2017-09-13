package xzh_7_20_Box;

import java.util.ArrayList;
import java.util.Collection;

public class BoxTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 3;
		
		Collection<Integer> c = new ArrayList<Integer>();
		
		c.add(3);
		c.add(a+3);
		
		for(Integer i:c){
			System.out.println(i);
		}
		
	}

}
