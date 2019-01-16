package hackerrank;

import java.util.Scanner; 

class Honda implements Cloneable {
	int speed ; 
	Honda(int speed) {
		this.speed = speed ; 
	}
	@Override
	public Object clone () throws CloneNotSupportedException {
		return super.clone() ; 
	}
}

public class TestObject{
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in) ; 
		Object obj = input.nextLine() , obj1 = input.nextLine() ; 
		System.out.println(obj.getClass()) ; 
		System.out.println(obj.hashCode()) ;
		System.out.println(obj.equals(obj1)) ;
		
		Honda myBike = new Honda(200) ;
		System.out.println("My Bike Has A Max Speed Is : " + myBike.speed) ; 
		try {
			Honda herBike = (Honda) myBike.clone() ;
			System.out.println(herBike.speed) ; 
		} catch (CloneNotSupportedException e){
			System.out.println("Clone Failed") ; 
		}
		
	}
}
