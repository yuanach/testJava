package testJava.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DemoUDPSocket01 {

	public static void main(String[] args) {

		try {
			server();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void server() throws IOException{
		DatagramSocket server=new DatagramSocket(9002);
		
		byte[] content = new byte[1024];
		//content="UDPServer Test".getBytes();

		DatagramPacket packet = new DatagramPacket(content, content.length);
		server.receive(packet);
		byte [] data = packet.getData();
		int len = packet.getLength();
		
		System.out.println("Server:"+new String(data,0,len));
		
		server.close();
		
	}

}
