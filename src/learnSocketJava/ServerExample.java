package learnSocketJava;

import java.io.DataInputStream ; 
import java.io.DataOutputStream;
import java.io.IOException ; 
import java.net.Socket ; 
import java.net.ServerSocket ; 
import java.net.SocketTimeoutException ; 

public class ServerExample extends Thread{
	private ServerSocket hostServer ; 
	
	public ServerExample (int port) throws IOException {
		this.hostServer = new ServerSocket(port) ; 
		hostServer.setSoTimeout(30000) ;
	}
	
	public void run() {
		while (true) {
			try {
				System.out.println("Waiting for client on port " + hostServer.getLocalPort() + "...") ; 
				Socket client = hostServer.accept() ; 
				
				System.out.println("Just Connect to " + client.getRemoteSocketAddress()) ;
				
				// get Data From Client 
				DataInputStream in = new DataInputStream(client.getInputStream()) ;
				System.out.println(in.readUTF()) ;
				System.out.println(in.readUTF()) ; 
				
				// send data to Client 
				DataOutputStream out = new DataOutputStream(client.getOutputStream()) ; 
				out.writeUTF("Welcome to my wonderland in " + client.getLocalSocketAddress() + " !!!") ;
				client.close(); 
			} catch (SocketTimeoutException e) {
				System.out.println("Socket Time Out") ; 
			} catch (IOException e) {
				e.printStackTrace();
				break ; 
			}
		}
	}
}
