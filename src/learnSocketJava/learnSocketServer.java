package learnSocketJava ;

import java.io.DataInputStream ; 
import java.io.DataOutputStream ; 
import java.io.IOException ; 
import java.net.ServerSocket ; 
import java.net.Socket ; 
import java.net.SocketException; 

public class learnSocketServer {
	public static void main (String[] args) {
		int port = Integer.parseInt("1234") ; 
		System.out.println("Hello") ; 
		try {
			Thread t = new ServerExample(port) ;
			t.start() ;
//			ServerExample newHost = new ServerExample(port) ; 
//			newHost.run1(); 
		} catch (IOException e){
			e.printStackTrace() ;
		}
	}
}
