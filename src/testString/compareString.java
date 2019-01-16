package testString;

public class compareString {
	public static void main (String[] args) {
		String s1 = "compare" ; 
		String s2 = "compare" ; 
		System.out.println(s1 == s2) ; 
		System.out.println(s1.equals(s2)) ;
		System.out.println(s1.compareTo(s2)) ; 
		s1 = new String ("compare") ; 
		s2 = new String ("compare") ; 
		System.out.println(s1 == s2) ;
		System.out.println(s1.equals(s2)) ; 
		System.out.println(s1.compareTo(s2)) ; 
	} 
 }
