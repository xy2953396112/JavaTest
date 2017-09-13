package xzh_2017_5_20_ConcurrentHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * CopyOnWriteArrayList/CopyOnWriteArraySet:写入并复制
 * @author lenovo
 *
 */
public class TestConcurrentHashMap {
      public static void main(String[] args) {
    	  
    	  HelloThread ht = new HelloThread();
    	  for (int i = 0; i < 10; i++) {
			new Thread(ht).start();
		}
	}
}

class HelloThread implements Runnable{
    
	//private static List<String> list = Collections.synchronizedList(new ArrayList<String>());
	private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
	static{
		list.add("A");
		list.add("B");
		list.add("C");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("list:"+list.toString());
		list.add("D");
	}
	
}
