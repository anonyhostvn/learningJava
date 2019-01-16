package testString;

public class immutableString {
	public static void main (String[] args) {
		String s = "Hello" ; 
		s.concat(" World") ; // concat() -> append into a String 
		System.out.println("this is s after run s.concat(\" \") : " + s) ; 
		s = s.concat(" World!") ; // set s equal to s.concat() 
		System.out.println("this is s after set s = s.concat(\" \") : " + s) ; 
	}
}
