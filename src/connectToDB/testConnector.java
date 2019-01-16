package connectToDB ;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.ResultSet ; 
import java.sql.Statement ; 

public class testConnector {
	private static String DB_URL = "jdbc:mysql://localhost:3306/zoo" ; 
	private static String USER_NAME = "root" ; 
	private static String PASS = "123456789" ;
	
	public static Connection getConnection (String dbUrl , String userName , String pass) {
		Connection conn = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver") ; 
			conn = DriverManager.getConnection(dbUrl, userName , pass) ;
			System.out.println("connect Successfully") ; 
		} catch (Exception e) {
			System.out.println("Connect Failed") ; 
		}
		return conn ; 
	}
	
	public static void main (String[] args) throws Exception {
		try {
			Connection conn = getConnection(DB_URL , USER_NAME, PASS) ; 
			Statement working = conn.createStatement() ; 
			ResultSet rs = working.executeQuery("SELECT * FROM ANIMALS ; ") ; 
			while (rs.next()) {
				System.out.println(rs.getString(1)) ; 
			}
		} catch (Exception e) {
			System.out.println("Query Failed") ; 
		}
	} 
}
