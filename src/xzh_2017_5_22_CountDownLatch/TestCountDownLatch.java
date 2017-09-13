package xzh_2017_5_22_CountDownLatch;

import java.util.concurrent.CountDownLatch;
/*
 * CountDownLatch ：闭锁，在完成某些运算时，只有其他所有线程的运算全部完成，当前运算才继续执行
 */
public class TestCountDownLatch {
   public static void main(String[] args) {
	
    CountDownLatch countDownLatch = new CountDownLatch(3);
    
    TestLatch latch = new TestLatch(countDownLatch);
    
    long start = System.currentTimeMillis();
    
    for (int i = 0; i < 5; i++) {
		new Thread(latch).start();
	}

	try {
		countDownLatch.await();
	} catch (InterruptedException e) {
	}
    
    long end = System.currentTimeMillis();
    //当所有的线程都执行完以后，才执行以后主线程 的操作
    System.out.println("time:"+(end-start));
   }
}

class TestLatch implements Runnable{
    
	private CountDownLatch latch;
	
	public TestLatch(CountDownLatch latch){
		this.latch=latch;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 100; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		} finally {
			latch.countDown();
		}
	}
	
}
