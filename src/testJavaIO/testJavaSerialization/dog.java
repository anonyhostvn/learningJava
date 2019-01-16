package testJavaIO.testJavaSerialization;

import java.io.Serializable;

public class dog implements Serializable {
	public int leg , age ;
	public String name , ownerName , gender ;
	public dog (int leg , int age , String name , String ownerName , String gender) {
		this.leg = leg ; 
		this.age = age ; 
		this.name = name ; 
		this.ownerName = ownerName ; 
		this.gender = gender ; 
	}
	public void print () {
		System.out.println("number of Leg : " + this.leg) ; 
		System.out.println("name of Dog : " + this.name) ; 
		System.out.println("owner of Dog 's name : " + this.ownerName) ; 
		System.out.println("sex of the Dog : " + this.gender) ; 
	}
}
