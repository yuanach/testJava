package testJava.net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoSocketServer01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9002);
		
		Socket socket = server.accept();
		
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		
		byte [] msg = "Welcome".getBytes();
		out.writeUTF(socket.getInetAddress().getHostAddress()+"Welcome.");
		
		out.flush();
		socket.close();
		
		
	}
}
