package hackerrank ; 

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
	public static final String regex = "<(.+)>([^<]+)<(/\\1)>"; 
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		Pattern compilePattern = Pattern.compile(regex) ; 
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Matcher obj = compilePattern.matcher(line) ;
			boolean found = false ; 
			while (obj.find()) {
				System.out.println(obj.group(2)) ;
				found = true ; 
			}
			if (!found) System.out.println("None") ; 
				}
			}
}