package testJavaIO;

import java.io.*; 

public class testByteArrayInputStream {
	public static void main (String[] args) throws IOException{
			byte[] buffer = {1 , 2 , 3 , 4 , 5} ;
			ByteArrayInputStream IContainer = new ByteArrayInputStream(buffer) ;
			FileInputStream input = new FileInputStream("inputSC.txt") ;
			int i = 0 ; 
			while ((i = IContainer.read()) != -1) System.out.println(i) ; 
	}
}
