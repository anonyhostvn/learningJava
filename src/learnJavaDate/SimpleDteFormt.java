package learnJavaDate;

import java.text.ParseException;
import java.text.SimpleDateFormat ; 
import java.util.Date ;

public class SimpleDteFormt {
	public static void main (String[] args) {
		
		//Format Date thanh String theo pattern
		Date particularDate = new Date() ; 
		SimpleDateFormat FormatterOnlyDate = new SimpleDateFormat("dd/MM/yyyy") ;
		SimpleDateFormat FormatterDateTime = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss zzzz") ; // 'z' -> ICT , 'zzzz' -> Indochina Time 
		String strDate = FormatterOnlyDate.format(particularDate) ; 
		String strDateTime = FormatterDateTime.format(particularDate) ;  
		System.out.println(strDate) ; 
		System.out.println(strDateTime) ; 
		
		//Format String thanh Date theo pattern
		try {
			Date date = FormatterOnlyDate.parse("17/07/2000") ; 
			System.out.println(date) ;
		} catch (ParseException e) {
			e.printStackTrace() ;
		}
	}
}
