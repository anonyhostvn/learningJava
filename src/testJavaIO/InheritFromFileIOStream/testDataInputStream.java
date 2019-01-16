package testJavaIO.InheritFromFileIOStream;

import java.io.* ; 

public class testDataInputStream {
	public static void main (String[] args) throws IOException {
		FileInputStream inputFile = new FileInputStream("inputSC.txt") ;
		DataInputStream input = new DataInputStream(inputFile) ;
		int i = inputFile.available() ;
		System.out.println(i) ; 
		while ((i = input.readInt()) != -1) {
			System.out.println(i) ; 
		}
	}
}
