package testJava.net;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress是单例模式
 */

public class DemoInetAddress01 {

	public static void main(String[] args) {
		InetAddress net=null;
		try {
			net=InetAddress.getLocalHost();
			net=InetAddress.getByName("www.baidu.com");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		String local=net.getHostAddress();
		System.out.println(local);
	}

}
