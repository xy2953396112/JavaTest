package xzh_8_8_Thread;

public class ThreadTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Runnable run = new HelloThread();
		
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		
		t1.start();
		t2.start();
	}

}

class HelloThread implements Runnable {
	
	int i = 0;
	
	public void run(){
		
		//int i = 0;
		
		while(true){
		   
		   System.out.println("num:"+i++);	
			
		   try {
			Thread.sleep((long)(Math.random()*1000));
		    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			   
		   if( 50 == i){
			   
			   break;
		   }
		}
		
	}
	
   }
