package testJavaIO.testJavaSerialization;

import java.io.*; 

public class testObjectOutputStream {
	public static void main (String[] args) throws IOException {
		FileOutputStream FOut = new FileOutputStream ("dogA.Data") ; 
		ObjectOutputStream outObj = new ObjectOutputStream(FOut) ; 
		dog dogA = new dog(4,5,"Phoc","An","male") ;
		outObj.writeObject(dogA) ; 
		outObj.close();
		FOut.close(); 
		System.out.println("Done!") ; 
	}
}
