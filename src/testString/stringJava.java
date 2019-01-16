package testString;

public class stringJava {
	public static void main (String[] args) {
		char[] ch = {'J' , 'a' , 'v' , 'a' , ' ', 'i' , 's' , ' ' , 'c' , 'o' }  ; 
		String s = new String(ch) ; // init a String by a array of char 
		String s1 = new String("Hello World ! ") ;  // init a String directly 
		String s2 = "Hello World" ; // init a String by parametter
		System.out.println(s) ; 
		System.out.println(s1) ; 
		System.out.println(s2) ; 
		s1 = new String("This is a String") ; // fix value of a String  
		System.out.println(s1) ; 
	}
}
