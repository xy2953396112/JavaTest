package xzh_2017_5_4_TestVolatile;

public class TestVolatile extends Thread {
   private volatile boolean stop =false;   //线程修改了以后对其他变量立即可见
   public void stopMe(){
	   stop = true;
   }
   
   public void run(){
	   int i =0;
	   while(!stop){
		   i++;
	   }
	   System.out.println("Stop thread");
   }
   
   public static void main(String[] args) throws InterruptedException {
	
	   TestVolatile tv = new TestVolatile();
	   tv.start();
	   Thread.sleep(1000);
	   tv.stopMe();
	   Thread.sleep(1000);
   }
}
				