package testException;

class myCheckedException extends Exception {
	public myCheckedException(String msg) {
		super (msg) ; 
	}
} 

public class checkedException {
	public static void main (String[] args) {
		//checkedException.testCheckedEception() ;
	}
	public static void testCheckedEception () throws myCheckedException{ 
		System.out.println("It's is my Checked Exception") ; 
	}
}
