package testJavaIO.testJavaSerialization;

import java.io.*;

public class testObjectInputStream {
	public static void main (String[] args) throws IOException, ClassNotFoundException {
		FileInputStream IFile = new FileInputStream("dogA.Data") ;
		ObjectInputStream IObj = new ObjectInputStream(IFile); 
		dog recallDog = (dog) IObj.readObject() ;
		recallDog.print() ; 
		IFile.close() ;
		IObj.close() ;
	}
}
