package testJavaIO;

import java.io.* ; 

public class testFileOutputStream {
	public static void main (String[] args) throws IOException {
		try {
			FileOutputStream input = new FileOutputStream ("inputST.txt") ;
			input.write('B') ; // write a character 
			String st = "this is the String in the pool" ; 
			byte[] ch = st.getBytes() ;  
			input.write(ch) ;
			input.close(); 
			System.out.println("Success") ; 
		} catch (IOException e) {
			System.out.println(e) ; 
		}
	}
}
