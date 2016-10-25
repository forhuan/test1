package test1;

import java.net.ServerSocket;
import java.net.Socket;

public class test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
		try {
			ServerSocket serverSocket = new ServerSocket(9876);
			while(true){			
				Socket socket = serverSocket.accept();
				System.out.println(socket.getInetAddress().getHostAddress());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.exit(1);
			
		}
		
	}
}
