package xzh_2017_5_23_ScheduledThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduledThreadPool {
    
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
		
	for (int s = 0; s < 10; s++) {
		
		Future<Integer> result = pool.schedule(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+":"+100);
				return 100;
			}
		}, 3, TimeUnit.SECONDS);
		System.out.println(result.get());
	  }
	pool.shutdown();
	}
}


