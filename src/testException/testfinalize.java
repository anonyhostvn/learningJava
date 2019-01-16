package testException;

class testFinalize {
	public int insideValue ; 
	testFinalize (int value) {
		this.insideValue = value ; 
	}
	@Override
	public void finalize () {
		System.out.println("Finalize Called") ; 
	}
}

public class testfinalize {
	public static void main (String[] args) {
		testFinalize obj = new testFinalize(12) ; 
		obj = null ;
		System.gc(); 
		obj.insideValue = 13 ; 
		System.out.println(obj.insideValue) ; 
	}
}
