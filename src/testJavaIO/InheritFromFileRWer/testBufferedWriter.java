package testJavaIO.InheritFromFileRWer;

import java.io.*; 

public class testBufferedWriter {
	public static void main (String[] args) throws IOException {
		FileWriter outputStream = new FileWriter ("inputSC.txt") ; 
		BufferedWriter BOutput = new BufferedWriter(outputStream) ;
		String st = "This is string to test BufferedWriter" ; 
		BOutput.write(st, 0,st.length()) ;
		BOutput.flush();
		BOutput.close() ; 
		System.out.println("Done!") ; 
	}
}
