package rpc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sachin
 */

import java.net.*;

import java.io.*;
public class Client {
    
    public void run() throws Exception{
        
      
        
        
    }
    
    
    
    public static void main(String[] args) throws Exception{
        
          Socket sock = new Socket("localhost",3000);
        
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        
        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream,true);
        
        InputStream istream = sock.getInputStream();
        
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
        
        System.out.println("Client is ready!!");
        
        String temp,receiveMessage;
        
        System.out.println("enter the message : ");
        
        temp = keyRead.readLine();
        
        pwrite.println(temp);
        
        if((receiveMessage = receiveRead.readLine()) != null){
        
              System.out.println(receiveMessage);
            
            
        }
    }
    
    
    
}
