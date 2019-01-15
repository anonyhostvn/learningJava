package learnJavaDate;

import java.util.Calendar;

public class javaCalendar {
	public static void main (String[] args) {
		Calendar obj = 	Calendar.getInstance() ; 
		System.out.println(obj.getTime()) ;
		obj.add(Calendar.DATE, 15) ;
		obj.add(Calendar.HOUR, 2) ;
		System.out.println(obj.get(Calendar.DATE)) ; 
	}
}