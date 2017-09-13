package xzh_2017_5_23_ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
 * 涉及到写操作的共享数据问题，需要加锁
 * @author xzh
 *  读写锁
 */
public class TestReadWriteLock {
       public static void main(String[] args) {
		
    	   final ReadWriteLockDemo demo = new ReadWriteLockDemo();
    	   
    	   //写线程
    	   new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo.set(100);
				
			 }
    	   },"write").start();
    	   
    	   //读线程
    	   for(int i=0;i<20;i++){
    		   
    		   new Thread(new Runnable() {
    				
    				@Override
    				public void run() {
    					demo.get();
    					
    				 }
    	    	   }).start();
    	   }
    	   
	}
}

class ReadWriteLockDemo{
	
	private int number = 0;
	
	private ReadWriteLock lock = new ReentrantReadWriteLock();
	
	//读操作
	public void get(){
		lock.readLock().lock();   //给读操作上锁
		try {
			System.out.println(Thread.currentThread().getName()+":"+number);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			lock.readLock().unlock();  //关闭锁
		}
	}
	
	//写操作
		public void set(int number){
			lock.writeLock().lock();   //给写操作上锁
			try {
				System.out.println(Thread.currentThread().getName());
				this.number=number;
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				lock.writeLock().unlock();  //关闭锁
			}
		}
	
}
