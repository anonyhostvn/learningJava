package testException;

public class tryCatch {
	public static void test() throws Exception {
		throw new Exception ("This is a Exception") ; 
	}
	
	public static void main (String[] args) {
		try {
			test() ; 
		} catch (Exception e) {
			System.out.println(e) ; 
		} 
		
		try {
			
			try {
				int[] arr = new int[5] ; 
				arr[5] = 6	 ; 
			} catch (Exception e) {
				System.out.println(e) ; 
			}
			int a = 50 / 0 ; 
 		} catch (ArithmeticException e) {
			System.out.println(e) ; 
		} catch (Exception a) {
			System.out.println(a) ; 	
		} finally {
			System.out.println("This is finally") ; 
		}
		
		try {
			throw new Exception("I like it Exception") ; 
		} catch (Exception e) {
			System.out.println(e) ; 
		}
		
		System.out.println("This is codong") ; 
	}
}
