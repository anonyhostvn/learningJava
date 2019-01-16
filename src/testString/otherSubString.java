package testString;

public class otherSubString {
	public static void toLowerUpperCase() {
		String s1 = "tHiS iS a NEW StrING" ;
		String s2 = s1.toLowerCase() ; 
		String s3 = s1.toUpperCase() ;
		System.out.println(s2 + "\n" + s3) ; 
	}
	
	public static void trimInJava() {
		String s1 = "   This is a new String   " ; 
		String s2 = s1.trim(); 
		System.out.println(s1 + "\n" + s2) ; 
	}
	
	public static void startEndWith() {
		String s1 = "abcdfefsad" ;
		System.out.println(s1) ; 
		System.out.println("Do the String start with \"abcd\" : " + s1.startsWith("abcd")) ; 
		System.out.println("do the String end with \"sad\" : " + s1.endsWith("sad")) ; 
	}
	
	public static void charAt() {
		String s1 = "0123456" ; 
		System.out.println(s1) ; 
		System.out.println("the char at point 3 is : " + s1.charAt(3)) ; 
	}
 	
	public static void length() {
		String s1 = "Hello Robots I'm Computer" ; 
		System.out.println("the length of \"" + s1 + "\" is " + s1.length()) ; 
	}
	
	public static void internString() {
		String s1 = new String ("helloimou") ; 
		String s2 = s1.intern() ; 
		System.out.println(s2) ; 
		System.out.println(s2 == s1) ; // == is compare the adress of String variables
	}
	
	public static void valueOf () { // convert int , float , double into String
		int intA = 123 ; 
		double doubleA = 123.123 ; 
		boolean boolA = true ;
		String s = String.valueOf(intA) + String.valueOf(doubleA) + String.valueOf(boolA) ;
		System.out.println(s) ;
	}
	
	public static void replace () {
		String a = "Java is a language program , Java is a Platform , Java is really complex ! " ;
		String b = a.replace("Java", "C++") ; 
		System.out.println(a + "\n" + b) ; 
 	}
	
	public static void main (String[] args) {
		toLowerUpperCase() ; 
		trimInJava() ; 
		startEndWith () ; 
		charAt(); 
		length() ; 
		internString() ; 
		valueOf() ; 
		replace () ; 
	}
}
