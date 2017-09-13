/**
 * 
 */
package xzh_2017_4_28_TestBlockingNIO;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author xzh   2017.4.28
 *
 */
public class BlockingNIO {
    
	
	public void client() throws IOException{
		//获取通道
		SocketChannel sc = SocketChannel.open(new InetSocketAddress("127.0.0.1",80));
		//获取文件
		FileChannel fc = FileChannel.open(Paths.get("2.txt"),StandardOpenOption.READ);
		//分配指定大小的缓冲区   //非直接缓冲区
		ByteBuffer bb = ByteBuffer.allocate(1024);
		
		while(fc.read(bb)!=-1){
			bb.flip();
			sc.write(bb);
			bb.clear();
		}
		fc.close();
		sc.close();
		
		
	}
	
	
	public void server() throws IOException{
		
		//打开服务端通道
		ServerSocketChannel ssc = ServerSocketChannel.open();
		//写入文件的Channel
		FileChannel fc = FileChannel.open(Paths.get("5.txt"),StandardOpenOption.WRITE,StandardOpenOption.CREATE);
        //绑定端口		
		ssc.bind( new InetSocketAddress(80));
		//获取客户端连接的通道
		SocketChannel sc = ssc.accept();
		//分配缓冲区大小
		ByteBuffer bb = ByteBuffer.allocate(1024);
		while(sc.read(bb)!=-1){
			bb.flip();
			fc.write(bb);
			bb.clear();
		}
		sc.close();
		fc.close();
		ssc.close();
		
	}
}
