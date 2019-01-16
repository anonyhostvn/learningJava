package testJavaIO;

import java.io.Console	 ; 

public class testConsole {
	public static void main (String[] args) throws Exception {
		try {
			Console c = System.console() ; 
			String n = c.readLine("asd") ; 
		} catch (Exception e) {
			System.out.println(e) ; 
		}
	}
}
