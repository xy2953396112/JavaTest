package xzh_2017_4_25_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestChannel {
	
   public static void main(String[] args) throws IOException {
	
	   RandomAccessFile raf = new RandomAccessFile("2.txt","rw");
	   
	   //获取通道
	   FileChannel fc =raf.getChannel();
	   
	   ByteBuffer buff1 = ByteBuffer.allocate(10);
	   ByteBuffer buff2 = ByteBuffer.allocate(1024);
	   
	   ByteBuffer[] buffer = {buff1,buff2};
	   
	   //分散读取
	   fc.read(buffer);
	   
	   for(ByteBuffer bb :buffer){
		   
		   bb.flip();
		   
	   }
	   
	   System.out.println(new String(buffer[0].array(),0,buffer[0].limit()));
	   System.out.println("-----------------------");
	   System.out.println(new String(buffer[1].array(),0,buffer[1].limit()));
      
	   //聚集写入
	   RandomAccessFile ac = new RandomAccessFile("4.txt","rw");
	   FileChannel fch = ac.getChannel();
	   fch.write(buffer);
	   raf.close();
	   ac.close();
	   
   }
}
