
package rpc;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.ServerSocket;

import java.net.*;
import java.io.*;

/**
 *
 * @author sachin
 */
public  class Server {
  
    
    public static void main(String[] args) throws Exception{
        
        
        
        ServerSocket sersock = new ServerSocket(3000);
        
        System.out.println("Server is ready");
        
        Socket sock = sersock.accept();
        
        OutputStream ostream = sock.getOutputStream();
        
        PrintWriter pwrite = new PrintWriter(ostream,true);
        
        InputStream istream = sock.getInputStream();
        
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
        
        String val;
        
        val = receiveRead.readLine();
        
        if(val != null){
            
            System.out.println(val);
            
        }
        
        pwrite.println(val);
        
        System.out.flush();
        
         
    
}

    
}


