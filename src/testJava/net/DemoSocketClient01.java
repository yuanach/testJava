package testJava.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DemoSocketClient01 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		InetSocketAddress local=new InetSocketAddress("OnsClient", 0);
		Socket socket = new Socket("202.205.84.141",9001,local.getAddress(),0);
//		System.out.println(socket.getLocalPort());
		
		DataOutputStream out =new DataOutputStream(socket.getOutputStream());
//		out.writeUTF(socket.getInetAddress().getHostName());
//		out.writeChars(socket.getInetAddress().getHostName());
		out.write(socket.getInetAddress().getHostName().getBytes());
		out.flush();
		DataInputStream in=new DataInputStream(socket.getInputStream());
		byte [] response = new byte[1024];
		
		in.read(response);
//		
		System.out.println(new String(response));
	}

}
