package testOverride;

public class Student {
	private String name, ID, email ;
	private int age ;
	
	public Student (String ID) {
		this.ID = ID ; 
	}
	
	public Student (String ID, String name, int age, String email) {
		this.ID = ID ; 
		this.name = name ; 
		this.age = age ; 
		this.email = email ;; 
	}
}
