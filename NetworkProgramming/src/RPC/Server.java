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
		
		String var1, var2, operator;
		
		var1 = receiveRead.readLine();
		var2 = receiveRead.readLine();
		
		operator = receiveRead.readLine();
		
		int a = Integer.parseInt(var1);
		int b = Integer.parseInt(var2);
		
		int result = 0;
		
		if(operator != null) {
			
			switch(operator) {
			case "+":
				result = a+b;
				break;
			case "-":
				result = a-b;
				break;
			case "/":
				result = a/b;
				break;
			case "*":
				result = a*b;
				break;
			default:
				break;
			}
			
			
			/*if(operator.compareTo("+")==0) {
				
				result = a + b;
			}
			
			if(operator.compareTo("-")==0) {
				
				result = a - b;
				
			}
			
			if(operator.compareTo("*")==0) {
				result = a * b;
			}
			
			if(operator.compareTo("/")==0) {
				result = a / b;
			}*/
			
			
			
		}
		
		pwrite.println(result);
		
		System.out.flush();
		
	}

}
