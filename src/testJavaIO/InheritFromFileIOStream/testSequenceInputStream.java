package testJavaIO.InheritFromFileIOStream;

import java.io.* ; 

public class testSequenceInputStream {
	public static void main (String[] args) throws Exception {
		File myFile = new File("inputSC.txt") ; 
		myFile.createNewFile() ; 
		File myfile = new File("outputST.txt") ; 
		myFile.createNewFile() ; 
		FileOutputStream outStream = new FileOutputStream(myFile) ; 
		String st = "This is a another String in Java Pool \n" ; 
		byte[] ch = st.getBytes() ; 
		outStream.write(ch) ; 
 		FileInputStream streamInput1 = new FileInputStream("inputST.txt") ; 
		FileInputStream streamInput2 = new FileInputStream("inputSC.txt") ; 
		SequenceInputStream overInput = new SequenceInputStream(streamInput1 , streamInput2) ; 
		int i = 0 ; 
		while ((i = overInput.read()) != -1) System.out.print((char) i ) ;  
	}
}
