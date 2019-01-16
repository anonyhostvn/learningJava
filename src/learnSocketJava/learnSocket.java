package testSocket;

import java.io.DataInputStream ; 
import java.io.DataOutputStream ; 
import java.io.IOException ; 
import java.io.InputStream ; 
import java.io.OutputStream ;
import java.util.Scanner ; 
import java.net.Socket ; 

public class learnSocket {
	public static void main (String[] args) {
		String serverName = "10.10.10.185" ; //args[0] ; 
		int port = Integer.parseInt("1234") ;
		try {
			System.out.println("Connecting to " + serverName + " on port " + port) ;
			Socket client = new Socket(serverName , port) ; 
			System.out.println("Just connect to " + client.getRemoteSocketAddress()) ;
			
			//upload Data 
			OutputStream outToServer = client.getOutputStream() ; 
			DataOutputStream out = new DataOutputStream(outToServer) ;
			
			System.out.print("Say some thing to the host : ") ; 
			Scanner input = new Scanner (System.in) ; 
			String st = input.nextLine() ; 
			
			out.writeUTF("Client says : " + st) ;
			out.writeUTF("Say Hello From " + client.getLocalSocketAddress()) ;
			
			// recieve data from host
			InputStream inFromServer = client.getInputStream() ; 
			DataInputStream in = new DataInputStream(inFromServer) ; 
			System.out.println("Server says : " + in.readUTF()) ; 
			client.close(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}
