package testJava.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class DemoUDPClient01 {

	public static void main(String[] args) {

		try {
			request();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void request() throws IOException{
		DatagramSocket client = new DatagramSocket(9012);

		byte[] msg = "I'm client.".getBytes();
		
		DatagramPacket packet = new DatagramPacket(msg, msg.length, 
				new InetSocketAddress("202.205.84.141",9002));
		
		client.send(packet);
		
		client.close();
		
	}
}
