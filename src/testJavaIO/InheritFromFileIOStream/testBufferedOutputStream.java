package testJavaIO.InheritFromFileIOStream;

import java.io.*; 

public class testBufferedOutputStream {
	public static void main (String[] args) throws IOException {
			FileOutputStream input = new FileOutputStream("inputST.txt") ; 
			BufferedOutputStream BInput = new BufferedOutputStream(input) ; 
			String st = "this is a string in Java pool" ; 
			byte[] ch = st.getBytes() ; 
			BInput.write(ch); 
			BInput.flush() ; 
	}
}
