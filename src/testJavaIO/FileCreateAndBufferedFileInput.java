package testJavaIO;

import java.io.* ; 

public class FileCreateAndBufferedFileInput {
	
	public static void main (String[] args) throws Exception {
		File myFile = new File("inputST.txt") ; 
		try {
			if (myFile.createNewFile()) System.out.println("File is created!") ; 
			else System.out.println("File are already existing") ; 
		} catch (IOException e) {
			System.out.println("Creating File Error") ; 
		}
		
		InputStream deInput = null ; 
		BufferedInputStream input = null ; 
		DataInputStream mainInput = null ; 
		
		try {
			deInput = new FileInputStream (myFile) ; 
			input = new BufferedInputStream(deInput) ; 
			mainInput = new DataInputStream (input) ; 
			System.out.println(mainInput.readLine()) ;
			System.out.println(mainInput.readLine()) ; 
		} catch (IOException e) {
			System.out.println("file is invalid ") ; 
		} finally {
		 

		}
		
	}
}
