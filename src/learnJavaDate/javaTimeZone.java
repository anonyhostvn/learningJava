package learnJavaDate;

import java.util.TimeZone ; 

public class javaTimeZone {
	public static void main(String[] args) {
		String[] zone = TimeZone.getAvailableIDs() ; // return an array of avaliable time zone  
		for (String st : zone) System.out.println(st); 
		System.out.println(TimeZone.getDefault()) ; // return TimeZone Object of default Time Zone of the computer 
		System.out.println(TimeZone.getTimeZone("Asia/Ho_Chi_Minh")) ; // return the TimeZone Objject arcording to ID
		TimeZone recentZone = TimeZone.getDefault() ; 
		System.out.println(recentZone.getDisplayName()) ; // return the String of DisplayName of TimeZone Object  
		System.out.println(recentZone.getID()) ; // return the string of ID of TimeZone obbject
		System.out.println(recentZone.getOffset(30)) ; 
		recentZone.setID("Zulu") ;
		System.out.println(recentZone.getDisplayName()) ;  	
	}
}
