package xzh_2017_5_23_Thread8Monitor;

/*
 * 题目：判断打印的 "one" or "two" ？
 * 
 * 1. 两个普通同步方法，两个线程，标准打印， 打印? //one  two
 * 2. 新增 Thread.sleep() 给 getOne() ,打印? //one  two
 * 3. 新增普通方法 getThree() , 打印? //three  one   two
 * 4. 两个普通同步方法，两个 Number 对象，打印?  //two  one
 * 5. 修改 getOne() 为静态同步方法，打印?  //two   one
 * 6. 修改两个方法均为静态同步方法，一个 Number 对象?  //one   two
 * 7. 一个静态同步方法，一个非静态同步方法，两个 Number 对象?  //two  one
 * 8. 两个静态同步方法，两个 Number 对象?   //one  two
 * 
 * 线程八锁的关键：
 * ①非静态方法的锁默认为  this(当前对象),  静态方法的锁为 对应的 Class 实例(只有一个)
 * ②某一个时刻内，只能有一个线程持有锁，无论几个方法。
 */
public class TestThread8Monitor {
     
	public static void main(String[] args) {
		
		final ThreadDemo  demo = new ThreadDemo();
		final ThreadDemo  demo1 = new ThreadDemo();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					demo.getOne();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		}).start();
		
        new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo1.getTwo();
				
			}
		}).start();
	}
	
	
}
class ThreadDemo{
	
	public synchronized void getOne() throws InterruptedException{
		//Thread.sleep(3000);
		System.out.println("one");
	}
	
	public synchronized void getTwo(){
		System.out.println("two");
	}
}