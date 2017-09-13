package xzh_8_8_Thread;

public class ThreadTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 Thread t1 = new Thread(new Thread3());
		 
		 t1.start();
		 
		 Thread t2 = new Thread(new Thread4());
		 
		 t2.start();
	}

}

class Thread3 implements Runnable{
	
	public void run(){
		
		for(int i=0;i<100;i++){
			
			System.out.println("Ðì³¯êÍ"+i);
		}
	}
	
}

class Thread4 implements Runnable{
	
	public void run(){
		
		for(int i=0;i<100;i++){
			
			System.out.println("xzh"+i);
		}
	}
	
}
