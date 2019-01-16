package testException;

class myUncheckedException extends RuntimeException {
	public myUncheckedException (String msg) {
		super (msg) ; 
	}
}

public class testUncheckedException {
	public static void methodUncheckedException() throws myUncheckedException {
		System.out.println("This is my unchecked exception") ; 
	}
	
	public static void main (String[] args) {
		testUncheckedException.methodUncheckedException() ; 
		//int a = 5 / 0 ; 
	}
}
