package testJavaIO;

import java.io.* ; 

public class testByteArrayOutputStream {
	public static void main (String[] args) throws IOException{
		ByteArrayOutputStream container = new ByteArrayOutputStream() ;
		FileOutputStream output1 = new FileOutputStream("inputSC.txt") ; 
		FileOutputStream output2 = new FileOutputStream("inputST.txt") ; 
		String st = "Hello, I'm your assistant ! " ; 
		container.write(st.getBytes()) ; 
		container.writeTo(output1) ;
		container.writeTo(output2) ;
		System.out.println("Mission Succes") ; 
	}
}
