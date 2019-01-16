package testJavaIO;

import java.io.*; 

public class testByteStream {
	public static void main (String[] args) throws Exception {
		FileInputStream input = new FileInputStream ("inputST.txt") ; 
		int c = 0 , cnt = 0 ; 
		while ((c = input.read()) != -1) {
			System.out.print((char) c) ; 
			cnt ++ ; 
		}
		System.out.println(cnt) ;
	} 
}
