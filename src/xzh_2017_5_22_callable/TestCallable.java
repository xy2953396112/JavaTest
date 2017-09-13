package xzh_2017_5_22_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 * callable接口相比于Runnable接口，可以有返回值，可以抛出异常，实现闭锁
 * @author lenovo
 *
 */
public class TestCallable {
   
	public static void main(String[] args) {
	    
		CallableDemo callable = new CallableDemo();
		
		FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
   
	    new Thread(futureTask).start();
	    Integer sum=0;
	    try {
		 sum = futureTask.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("sum:"+(sum));
	    System.out.println("xzhxhzhxzhx");  //callable接口也可以实现闭锁
	}
}

class CallableDemo implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Integer sum=0;
		for(int i=0;i<10000;i++){
			sum = sum+i;
		}
		
		return sum;
	}

	
	
}
