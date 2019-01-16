package testJavaIO;

import java.io.* ; 

public class testFileReader {
	public static void main (String[] args) throws IOException {
		FileReader input = new FileReader("inputST.txt") ; 
		int c = 0 ; 
		while ((c = input.read()) != -1) System.out.print((char) c) 	;  
	}
}
