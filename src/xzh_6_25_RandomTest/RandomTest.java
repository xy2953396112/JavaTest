package xzh_6_25_RandomTest;

import java.util.Random;

public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Random ra = new Random();
         for(int i=0;i<50;i++){
         System.out.println(ra.nextInt(41)+10);
         }
	} 

}
