package xzh_2017_5_4_HeapArgs;

public class Heap {
	//堆分配参数
     public static void main(String[] args) {
		 Byte[] b = new Byte[1*1024*1024];
		 System.out.println(b.toString().getBytes());
    	 System.out.println("maxMemory:"+Runtime.getRuntime().maxMemory()/1024/1024);
    	 System.out.println("freeMemory:"+Runtime.getRuntime().freeMemory()/1024/1024);
    	 System.out.println("totalMemory:"+Runtime.getRuntime().totalMemory()/1024/1024);
    	 
    	 System.out.println("-----------------------------");
    	 System.gc();
    	 System.out.println("maxMemory:"+Runtime.getRuntime().maxMemory()/1024/1024);
    	 System.out.println("freeMemory:"+Runtime.getRuntime().freeMemory()/1024/1024);
    	 System.out.println("totalMemory:"+Runtime.getRuntime().totalMemory()/1024/1024);
    	 
	}
}
