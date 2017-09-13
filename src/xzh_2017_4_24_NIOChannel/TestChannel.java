package xzh_2017_4_24_NIOChannel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestChannel {
   
	
	public static void main(String[] args) throws IOException{
		FileChannel inChannel = FileChannel.open(Paths.get("2.txt"),StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("3.txt"),StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE_NEW);
		
		//内存映射文件
		MappedByteBuffer inMappedBuf = inChannel.map(MapMode.READ_ONLY,0,inChannel.size());
		MappedByteBuffer outMappedBuf = outChannel.map(MapMode.READ_WRITE,0,inChannel.size());
	    
		//缓冲区
	    byte[] dest = new byte[inMappedBuf.limit()];
	    inMappedBuf.get(dest);
	    outMappedBuf.put(dest);
	    
	    inChannel.close();
	    outChannel.close();
	}
	//非直接缓冲区
	public static void Test(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xzh.txt");
		FileOutputStream fos = new FileOutputStream("2.txt");
		
		//通道
		FileChannel fic  = fis.getChannel();
		FileChannel foc  = fos.getChannel();
		
		//
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		while(fic.read(buffer)!=1){
			buffer.flip();        //切换读数据模式
			foc.write(buffer);
			buffer.clear();
			
		}
		
		fic.close();
		foc.close();
		fis.close();
		fos.close();
		
		
	}
}
