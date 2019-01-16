package testJavaIO.InheritFromFileIOStream;

import java.io.*;

public class testPrintStream {
	public static void main (String[] args) throws IOException {
		FileOutputStream outStream = new FileOutputStream("inputST.txt") ; 
		PrintStream output = new PrintStream(outStream) ; 	
		output.print("Hello I'm Long !!!!!!") ; 
	}
}
