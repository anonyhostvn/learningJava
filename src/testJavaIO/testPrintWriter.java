package testJavaIO;

import java.io.*;

public class testPrintWriter {
	public static void main (String[] args) throws IOException {
		PrintWriter output = new PrintWriter("inputST.txt") ; 
		output.write("Hello NextG") ;
		output.flush(); 
		System.out.println("Done!") ; 
	}
}
