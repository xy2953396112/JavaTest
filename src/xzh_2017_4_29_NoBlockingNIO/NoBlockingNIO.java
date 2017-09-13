package xzh_2017_4_29_NoBlockingNIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;

public class NoBlockingNIO {
     
	public void client() throws IOException{
		SocketChannel sc = SocketChannel.open(new InetSocketAddress("127.0.0.1",80));
		//切换为非阻塞模式
		sc.configureBlocking(false);
		ByteBuffer buf = ByteBuffer.allocate(1024);
		buf.put(new Date().toString().getBytes());
		buf.flip();
		sc.write(buf);
		buf.clear();
		sc.close();
		
	}
	//非阻塞式
	public void server() throws IOException{
		//获取通道
		ServerSocketChannel ssc = ServerSocketChannel.open();
		//切换非阻塞式模式
		ssc.configureBlocking(false);
		//绑定连接
		ssc.bind(new InetSocketAddress(80));
		//获取选择器
		Selector selector = Selector.open();
		//将通道注册到选择器上,并且指定监听接收时间
		ssc.register(selector, SelectionKey.OP_ACCEPT);
		//轮询式的获取选择器上已经准备就须的事件
		while(selector.select() >0){
			//获取当前选择器中所有注册的选择键(已就绪事件)
		    Iterator<SelectionKey> it = selector.selectedKeys().iterator();
		    while(it.hasNext()){
		    	//获取准备就绪的事件
		    	SelectionKey sk = it.next();
		    	//判断具体是什么事件准备就绪
		    	if(sk.isAcceptable()){
		    		//若接收就绪,获取客户端连接
		    		SocketChannel soc = ssc.accept();
		    		//切换非阻塞模式
		    		soc.configureBlocking(false);
                    //将该通道注册到选择器上
		    		ssc.register(selector, SelectionKey.OP_READ);
		    		
		    	}else if(sk.isReadable()){
		    		//获得当前选择器上读就绪状态的通道
		    		SocketChannel sChannel = (SocketChannel) sk.channel();
		    		//读取数据
		    		ByteBuffer buf = ByteBuffer.allocate(1024);
		    		int len =0;
		    		while((len = sChannel.read(buf))>0){
		    			buf.flip();
		    			System.out.println(new String(buf.array(),0,len));
		    			buf.clear();
		    		}
		    		
		    	}
		    	
		    	//取消选择键SelectionKey	
		    	it.remove();
		    }
		}
	}
}
