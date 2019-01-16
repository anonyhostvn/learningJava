package learnJavaDate;

import java.util.Calendar;
import java.text.DateFormat ; 
import java.util.Date ; 

public class JavaDateTimeFormat {
	public static void main (String[] args) throws Exception {
		Calendar obj = Calendar.getInstance() ; 
		Date recentDay = obj.getTime(); 
		System.out.println(recentDay) ; 
		
		// Chuyen doi tu Date thanh String 
		String stringOfDate = DateFormat.getInstance().format(recentDay); 
		System.out.println(stringOfDate) ;
		
		// Chuyen doi Date thanh String chi lay ngay thang nam
		String stringOfDateInstance = DateFormat.getDateInstance().format(recentDay) ; 
		System.out.println(stringOfDateInstance) ;
		
		// Chuyen doi  Date thanh String chi lay time
		String stringOfTimeInstance = DateFormat.getTimeInstance().format(recentDay) ; 
		System.out.println((stringOfTimeInstance)) ; 
		
		//Chuyen doi Date thanh String lay Date va Time
		String stringOfDateTimeInstance = DateFormat.getDateTimeInstance().format(recentDay) ; 
		System.out.println(stringOfDateTimeInstance) ; 
		
		//Chuyen doi Date thanh String voi dinh dang cho truoc 
		String std = DateFormat.getDateTimeInstance(DateFormat.SHORT , DateFormat.LONG).format(recentDay) ;
		System.out.println(std) ; 
		
		//chuyen doi String thanh Date
		Date absoluteDate = DateFormat.getDateInstance(DateFormat.SHORT).parse("07/17/00") ; 
		System.out.println(absoluteDate) ; 
	}
}
