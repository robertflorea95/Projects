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
		
		String receiveMessage, a, b, operator;
		
		System.out.println("Enter the value of a:");
		
		a = keyRead.readLine();
		
		pwrite.println(a);
		
		System.out.println("Enter the value of b:");
		
		b = keyRead.readLine();
		
		pwrite.println(b);
		
		System.out.println("Enter the operation you want to do (+, -, /, *) :");
		
		operator = keyRead.readLine();
		
		pwrite.println(operator);
		
		
		if ((receiveMessage = receiveRead.readLine()) != null) {
			
			System.out.println(receiveMessage);
			
		}
				
				
				
	}

}
