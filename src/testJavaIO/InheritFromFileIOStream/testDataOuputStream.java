package testJavaIO.InheritFromFileIOStream;

import java.io.* ; 

public class testDataOuputStream {
	public static void main(String[] args) throws IOException{ 
		FileOutputStream outputFile = new FileOutputStream ("inputST.txt") ;  
		DataOutputStream out = new DataOutputStream(outputFile) ; 
		String st = "sdadadasd" ; 
		out.writeChar(65) ;
		out.flush() ; 
		System.out.println("Success") ; 
	}
}
