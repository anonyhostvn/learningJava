package hackerrank;

import java.util.regex.Pattern ;
import java.util.regex.Matcher ; 

public class testPattern {
	public static void main (String[] args) {
		String text = "This is the text to be search " + "for occurrences of the http:// pattern." ; 
		String text1 = "Hello is a English Word" ; 
		String text3 = "Goodbye bye bye world world world" ; 
		
		String patternString = "\\b(\\w+)(?:\\W+\\1\\b)+" ; 
		Pattern compilePattern = Pattern.compile(patternString , Pattern.CASE_INSENSITIVE) ; 
		Matcher matcherObj = compilePattern.matcher(text3) ;
		String stRes = "" ; 
		while (matcherObj.find()) { 
			text3 = text3.replaceAll(matcherObj.group() , matcherObj.group(1)) ; 
		}
				
		System.out.println(text3) ; 	
	}
}
