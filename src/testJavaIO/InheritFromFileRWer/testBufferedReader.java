package testJavaIO.InheritFromFileRWer;

import java.io.* ; 

public class testBufferedReader {
	public static void main (String[] args) throws Exception {
		FileReader fr = new FileReader ("inputSC.txt") ; 
		BufferedReader br = new BufferedReader (fr) ; 
		String s = new String() ; 
		while ((s = br.readLine()) != null) {
			System.out.println(s) ; 
		}
	}
}
