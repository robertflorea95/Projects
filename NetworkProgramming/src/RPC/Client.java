package RPC;

import java.io.*;
import java.net.*;

public class Client {
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Socket sock = new Socket ("localhost", 3000);
		
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		
		OutputStream ostream = sock.getOutputStream();
		PrintWriter pwrite = new PrintWriter(ostream, true);
		
		InputStream istream = sock.getInputStream();
		
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
		
		System.out.println(("Client is ready!!"));
		
		String temp, receiveMessage;
		
		System.out.println("Enter the message: ");
		
		temp = keyRead.readLine();
		
		pwrite.println(temp);
		
		if ((receiveMessage = receiveRead.readLine()) != null) {
			
			System.out.println(receiveMessage);
			
		}
				
				
				
	}

}
