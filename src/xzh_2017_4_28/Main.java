package xzh_2017_4_28;

public class Main {
   
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		
		tt.start();
		
		TestRunnable runnable = new TestRunnable();
		//给实现Runnable线程类起名字
		Thread thread = new Thread(runnable, "NewThread");
		thread.start();
		System.out.println(thread.getName());
		//得到当前线程引用的名字
		System.out.println(Thread.currentThread().getName());
	}
}
