/**
 * A class that implements the Singleton
 * design pattern. 
 * 
 * @author	William McGrew
 * @revised	31 October 2016
 */ 
public class Runner {
	
	public static void main(String[] args) {
		
		TheOneRing ringOne = TheOneRing.getInstance();
		
		ringOne.castIntoTheFire();
		
		TheOneRing ringTwo = TheOneRing.getInstance();
		System.out.println("There is only one: " + (ringOne == ringTwo));
		
		System.out.println();
		
		Geist myGeist = new Geist("Casper");
		myGeist.herumgeistern();
		myGeist.erschrecken();
	}//end method main
}//end class Runner