package testJava.net;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class DemoSocketAddress01 {

	public static void main(String[] args) {
		
		InetSocketAddress socket=new InetSocketAddress("www.baidu.com",80);
		InetAddress net=socket.getAddress();
		
		System.out.println(net.getHostAddress());
		System.out.println(net.getHostAddress());
	}

}
