package testJavaIO;

import java.io.*; 

public class testFileInputStream {
	public static void main (String[] args) throws IOException {
		FileInputStream input = new FileInputStream ("inputST.txt") ; 
		int i = input.read(); 
		System.out.println(i) ; 
		while ((i = input.read()) != -1) System.out.print(i) ; 
	}
}
