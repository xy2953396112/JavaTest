package xzh_6_30_SetTest;

import java.util.HashSet;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashSet hs = new HashSet();
                         //����û��˳��
         System.out.println(hs.add("one"));
         hs.add("second");
         hs.add("three");
         System.out.println(hs.add("one"));
         
         System.out.println(hs);
         
	}

}
