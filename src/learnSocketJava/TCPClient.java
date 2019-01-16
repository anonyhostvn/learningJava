package testSocket;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	private Socket client ; 
	private String serverHost = "10.10.10.185" ; 
	private int serverPort = 1234 ; 
	
	public void connectServer () {
		try {
			client = new Socket(serverHost , serverPort) ;
		} catch (UnknownHostException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	
	public void sendFile (String sourceFilePath , String destinationDir) {
		DataOutputStream outToServer = null ; 
		ObjectOutputStream oos = null ; 
		ObjectInputStream ois = null ;
		
		try {
			//get Greeting To Host
			outToServer = new DataOutputStream(client.getOutputStream()) ;
			outToServer.writeUTF("Hello From " + client.getLocalSocketAddress()) ;
			
			// get file Info 
			FileInfo file = getFileInfo(sourceFilePath , destinationDir) ;
			
			//send File 
			oos = new ObjectOutputStream (client.getOutputStream()) ;
			oos.writeObject(file);
			
			//get confirmation 
			ois = new ObjectInputStream(client.getInputStream()) ; 
			file = (FileInfo) ois.readObject() ; 
			if (file != null) {
				System.out.print(file.getStatus()) ;
			}
			
		} catch (IOException e) {
			e.printStackTrace(); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeStream(oos) ; 
			closeStream(ois) ; 
			closeStream(outToServer) ; 
		}
	}
	
	public FileInfo getFileInfo (String sourceFilePath , String destinationDir) {
		FileInfo file = null ; 
		BufferedInputStream bis = null ; 
		
		try {
			File sourceFile = new File(sourceFilePath) ; 
			bis = new BufferedInputStream(new FileInputStream(sourceFile)) ; 
			file = new FileInfo() ; 
			byte[] fileBytes = new byte[(int) sourceFile.length()] ;
			file.setFilename(sourceFile.getName()) ;
			file.setDataBytes(fileBytes) ;
			file.setDestinationDirectory(destinationDir) ;
		} catch (IOException e) {
			e.printStackTrace() ;
		} finally {
			closeStream(bis) ; 
		}
		
		return file ; 
	}
	
	public void closeSocket (Socket s) {
		try {
			if (s != null) s.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeStream(InputStream Stream) {
		try {
			if (Stream != null) Stream.close(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	
	public void closeStream(OutputStream Stream) {
		try {
			if (Stream != null) Stream.close(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}
