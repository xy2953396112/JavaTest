package xzh_6_30_Queue;

import java.util.LinkedList;

public class MyQueue {
     
	private LinkedList  list = new LinkedList();
	
	public void put(Object o)
	{
         list.addLast(o);
	}
	
	public Object get()
	{
		 return list.removeFirst();
		
	}
	
	public boolean isEmpty()
	{
		return  list.isEmpty();
		
	}
	
}
