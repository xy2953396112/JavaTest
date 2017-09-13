package xzh_2017_5_23_ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
    	ThreadPoolDemo demo = new ThreadPoolDemo();
    	//创建线程池
    	ExecutorService executorService = Executors.newFixedThreadPool(5);
    	
    	//执行实现Runnable的线程
    	//executorService.submit(demo);
    	
    	//执行实现Callable的线程
    	List<Future> list  = new ArrayList<Future>();
    	
    	for(int i =0;i<6;i++){
    		Future<Integer> future = executorService.submit(new Callable<Integer>() {
            Integer sum=0;
			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				for(int i=1;i<=100;i++){
					sum=sum+i;
				}
				return sum;
			}
		});
    	list.add(future);
    	}
    	
    	//关闭连接池
    	executorService.shutdown();
    	
    	for(Future future:list){
    		System.out.println(future.get());
    	}
	}
}
class ThreadPoolDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
	
}
