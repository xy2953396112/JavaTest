package xzh_2017_4_24_redis;

import java.nio.ByteBuffer;

public class TestByteBuffer {
  
	public static void main(String[] args) {
	   //直接缓冲区        //非直接缓冲区ByteBuufer.allocateDirect
	   //直接缓冲区把数据直接放在物理内存，由操作系统直接处理,
	   //非直接缓冲区先经过JVM的缓冲，数据copy到OS的缓冲,最后存储到物理存储空间中
	   ByteBuffer bb = ByteBuffer.allocateDirect(1024);   
	   System.out.println(bb.isDirect());
   }
}
