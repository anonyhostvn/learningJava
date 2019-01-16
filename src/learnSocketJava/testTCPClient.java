package testSocket;

public class testTCPClient {
	public static void main (String[] args) {
		TCPClient client = new TCPClient() ; 
		client.connectServer(); 
		client.sendFile("/home/anonyhost/ans.csv", "/home/anonyhost/") ;
	}
}
