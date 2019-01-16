package testString;

import java.util.StringTokenizer ; 

public class TestStringTokenizer {
	public static void main (String[] args) {
		StringTokenizer st = new StringTokenizer ("Hello Toi la Java  ! Yeah Yeah  " , "oe ") ;  
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken()) ; 
		}
	}
}
