package testString;

public class connectString {
	public static void main (String[] args) {
		String s1 = "This is the greatest " ; 
		String s2 = "Showman" ; 
		String s3 = s1 + s2 ; // append String by +  
		String s4 = s1.concat(s2) ; // append String by .concat() 
		System.out.println(s3 + "\n" + s4) ; 
	}
}
