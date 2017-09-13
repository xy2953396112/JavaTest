package xzh_8_9_ExampleThread;

public class ExampleTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Example exa = new Example();
		
		MyThread1 t1 = new MyThread1(exa);
		
		MyThread2 t2 = new MyThread2(exa);
		
		t1.start();
		
		t2.start();
	}

}

class Example{
	
	private Object object = new Object();
	
	public void execute() throws InterruptedException{
		
		synchronized (object) {
			
		
			for(int i=0;i<20;i++){
			
				Thread.sleep((long) (Math.random()*1000));
			
				System.out.println("xzh"+":"+i);
			}
		}
	}
	
	public void execute2() throws InterruptedException{
		
			synchronized (object) {
	
			   for(int i=0;i<20;i++){
				
				   Thread.sleep((long) (Math.random()*1000));
				
				   System.out.println("Ðì³¯êÍ"+":"+i);
			   }
			}
	}

}

class MyThread1 extends Thread{
	
	private Example example;
	
	public MyThread1(Example example){
		
		this.example = example;
	}
	
	public void run(){
		
		try {
			this.example.execute();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}

class MyThread2 extends Thread{
	
	private Example example;
	
	public MyThread2(Example example){
		
		this.example = example;
	}
	
	public void run(){
		
		try {
			this.example.execute2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
