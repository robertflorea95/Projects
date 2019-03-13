package RPC;

import java.io.*;
import java.net.*;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ServerSocket serverSocket = new ServerSocket(3000);
		
		System.out.println("Server is ready");
		
		Socket socket = serverSocket.accept();
		
		OutputStream ostream = socket.getOutputStream();
		
		PrintWriter pwrite = new PrintWriter(ostream, true);
		
		InputStream istream = socket.getInputStream();
		
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
		
		String value = receiveRead.readLine();
		
		if(value!= null) {
			
			System.out.println(value);
		}
		
		pwrite.println(value);
		
		System.out.flush();
		
	}

}
