package testInnerClass;

interface Animals {
	int numLeg = 0 ; 
	void bark() ; 
}

public class testInnerClass {
	int aVariables ; 
	class inside {
		public void printSth () {
			System.out.println(aVariables) ; 
		}
	
	}

	
	public static void main (String[] args) {
		Animals kun = new Animals() {
			@Override
			public void bark () {
				System.out.println("Wolf Wolf Wolf !!") ; 
			}
		} ; 
		kun.bark() ; 
		
		class rabbit {
			int Leg ;
			rabbit (int numLeg) {
				this.Leg = numLeg ;
			}
			
			void showNumLeg() {
				System.out.println(this.Leg) ; 
			}
		}
		
		rabbit myRab = new rabbit(4) ;
		myRab.showNumLeg(); 
	}
}
