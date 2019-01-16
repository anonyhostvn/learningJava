package testJavaIO.InheritFromFileIOStream;

import java.io.*;

public class testFilterOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileInput = new FileOutputStream("inputST.txt") ; 
		FilterOutputStream input = new FilterOutputStream(fileInput) ; 
		String st = "Hello , I'm a String and I'm going to stream" ;
		input.write(st.getBytes()) ;
		input.flush() ; 
		System.out.println("Done!") ; 	
	}
}
