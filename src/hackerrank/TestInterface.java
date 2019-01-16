package hackerrank;

interface polygon {
	void getS() ; 
	void getC() ; 
	void draw() ; 
}

class rectangle implements polygon {
	int W , H ; 
	rectangle (int W , int H) {
		this.W = W ; 
		this.H = H ; 
	}
	@Override
	public void getS() {
		System.out.println(W * H) ; 
	}
	
	@Override
	public void getC () {
		System.out.println(2 * (W + H)) ; 
	}
	
	@Override
	public void draw () {
		for (int i = 1 ; i <= H ; i ++) System.out.print("*") ; 
		System.out.println(); 
		for (int i = 1 ; i <= W-2 ; i ++) {
			System.out.print("*") ;
			for (int j = 1 ; j <= H - 2 ; j ++) System.out.print(" ") ;
			System.out.print("*\n") ; 
		}
		for (int i = 1 ; i <= H ; i ++) System.out.print("*") ;
		System.out.println() ; 
	}
}

public class TestInterface {
	public static void main (String [] args) {
		rectangle bola = new rectangle(10 , 12) ; 
		bola.getS () ; 
		bola.getC() ; 
		bola.draw() ; 
	}
}
