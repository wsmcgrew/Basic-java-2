/**
 * A class that implements the Singleton
 * design pattern. 
 * 
 * @author	William McGrew
 * @revised	31 October 2016
 */ 
public class TheOneRing {
	private static TheOneRing instance = null;
	private String bearer;	// the ring's bearer
	
	/**
	* private constuctor that can only be called from inside the class
	**/
	private TheOneRing(){
		bearer = "Sauron the Deceiver";
	}//endConstructor
	
	/**
	* static method that calls the constructor
	* to create an instance if it hasnt been created
	* or it will return the instance
	**/
	public static TheOneRing getInstance() {
		if (instance == null) {
			instance = new TheOneRing();
		} 
		return instance;
	}//end method getInstance
	
	/**
	 * Reveals the ring's secrets to the clever wizard.
	 */ 
	public void castIntoTheFire() {
		System.out.println(); 
		System.out.println("One Ring to rule them all, One Ring to find them, "); 
		System.out.println("One Ring to bring them all and in the darkness bind them. "); 
		System.out.println(); 
	} // end method castIntoTheFire
} // end class TheOneRing