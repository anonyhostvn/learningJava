package hackerrank;

public class testEquals {
	public static void main (String[] args) {
		String s1 = new String("asdasdasd") ; 
		String s2 = "asdasdasd" ; 
		String s3 = "asdad" ; 
		String s4 = "asdad" ; 
		System.out.println("s1.equals(s2) : " + s1.equals(s2)) ;
		System.out.println(s1 == s2) ;
		System.out.println(s3.equals(s4)) ; 
		System.out.println(s3 == s4) ; 
	}
}
