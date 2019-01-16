package learnSocketJava;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPSHost extends Thread {
	private ServerSocket hostSocket  ; 
	private int serverPort = 1234 ; 
	
	public void open() {
		try {
			hostSocket = new ServerSocket(serverPort) ;
			System.out.println("Server is open on port : " + serverPort) ;
		} catch (IOException e) {
			System.out.println("Falied To Open Server At Port : " + serverPort) ;  
		}
	}
	
	public void run() {
		while (true) {
			Socket client = null ; 
			DataInputStream inFromClient = null ; 
			ObjectInputStream ois = null ; 
			ObjectOutputStream oos = null ; 
			
			try {
				// accept Connect from client and create Socket Object 
				client = hostSocket.accept() ; 
				System.out.println("Connect Successfully To Client At : " + client.getRemoteSocketAddress()) ;
				
				//get Greeting From Client 
				inFromClient = new DataInputStream(client.getInputStream()) ; 
				System.out.println(inFromClient.readUTF()) ; 
				
				//receive File Info 
				ois = new ObjectInputStream(client.getInputStream()) ; 
				FileInfo file = (FileInfo) ois.readObject() ; 
				if (file != null) {
					createFile(file) ; 
				}
				
				//confirm that file is recieved 
				oos = new ObjectOutputStream(client.getOutputStream()) ; 
				file.setStatus("Success") ;
				file.setDataBytes(null) ;
				oos.writeObject(file) ; 
			} catch (IOException e) {
				e.printStackTrace() ;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				// close stream 
				closeStream(ois) ; 
				closeStream(oos) ; 
				closeStream(inFromClient) ;
				//close session 
				closeSocket(client) ; 
			}
		}
	}
	
	private boolean createFile(FileInfo file) {
		BufferedOutputStream bos = null ; 
		try {
			if (file != null) {
				File recieveFile = new File(file.getDestinationDirectory() + file.getFilename()) ;
				bos = new BufferedOutputStream(new FileOutputStream(recieveFile)) ; 
				bos.write(file.getDataBytes()) ;
				bos.flush() ; 
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false ; 
		} finally {
			closeStream(bos) ; 
		}
		return true  ; 
	}
	
	public void closeStream (InputStream stream) {
		try {
			if (stream != null) stream.close() ; 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	
	public void closeStream(OutputStream stream) {
		try {
			if (stream != null) stream.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeSocket(Socket s) {
		try {
			if (s != null) {
				s.close(); 
			}
		} catch (IOException e) {
			e.printStackTrace() ; 
		}
	}
} 
