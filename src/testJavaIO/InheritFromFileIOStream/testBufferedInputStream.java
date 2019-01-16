package testJavaIO.InheritFromFileIOStream;
import java.io.*;

public class testBufferedInputStream {
	public static void main (String[] args) throws IOException {
		FileInputStream input = new FileInputStream("inputST.txt") ; 
		BufferedInputStream BInput = new BufferedInputStream(input) ; 
		int i = 0 ; 
		while ((i = BInput.read()) != -1) {
			System.out.print((char) i) ; 
		} 
	}
}
