package learnJavaDate;

import java.util.Calendar;

public class javaCalendar {
	public static void main (String[] args) {
		Calendar obj = 	Calendar.getInstance() ; // return Object 'Calendar' of recent time
		System.out.println(obj.getTime()) ; // return the Object 'Date' refer to recent time of 'Calendar' Object
		obj.add(Calendar.DATE, 2) ; // add some value to the field of 'Calendar' Object
		obj.add(Calendar.HOUR, 2) ;
		System.out.println(obj.get(Calendar.DATE)) ; // get the value of the field of 'Calendar' Object
		System.out.println(obj.getMaximum(Calendar.DATE)) ; // get Maximum of the field of 'Calendar' Object
		System.out.println(obj.getMinimum(obj.YEAR)) ; // get Minimum of the field of 'Calendar' Object
		obj.set(obj.DATE , 20) ;  // set the value to the field of 'Calendar' Object
		System.out.println(obj.getTime()) ; 
	}
}