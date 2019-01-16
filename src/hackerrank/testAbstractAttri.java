package hackerrank;

abstract class motor {
	int speed ; 

	abstract void run () ;
	abstract void showSpeed() ;  
}

class Honda4 extends motor {
	@Override
	void run () {
		System.out.println("This is Honda4 motor") ; 
	}
	
	@Override
	void showSpeed () {
		speed = 123 ; 
		System.out.println("Speed of this motor is " + super.speed) ; 
	}
}

public class testAbstractAttri {
	public static void main (String[] args) {
		Honda4 myMotor = new Honda4() ;
		myMotor.run() ; 
		myMotor.showSpeed(); 
	}
}
