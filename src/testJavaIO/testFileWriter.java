package testJavaIO;

import java.io.*; 

public class testFileWriter {
	public static void main (String[] args) throws IOException {
		FileWriter output = new FileWriter("inputSC.txt") ; 
		output.write("This is me") ; 
		output.flush() ; 
		System.out.println("Program done ! ") ; 
	}
}
