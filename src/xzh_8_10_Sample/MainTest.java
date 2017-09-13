package xzh_8_10_Sample;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Sample sample = new Sample();
		
		Thread t1 = new IncreaseThread(sample);
		
		Thread t2 = new DecreaseThread(sample);
		
		t1.start();
		
		t2.start();
	}

}
