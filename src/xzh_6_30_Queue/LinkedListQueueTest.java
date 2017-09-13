package xzh_6_30_Queue;

public class LinkedListQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyQueue mq = new MyQueue();
       mq.put("one");
       mq.put("second");
       mq.put("three");
       
       System.out.println(mq.get());
       System.out.println(mq.get());
       System.out.println(mq.get());
       
       System.out.println(mq.isEmpty());
	}

}
