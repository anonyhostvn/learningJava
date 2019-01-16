package testJavaIO.InheritFromFileIOStream;

import java.io.*;

public class testFilterInputStream {
	public static void main (String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream(new File("inputST.txt")) ; 
		FilterInputStream input = new BufferedInputStream(fileInput) ;
		int i = 0 ; 
		while ((i = input.read()) != -1) System.out.println((char) i) ; 
	}
}
