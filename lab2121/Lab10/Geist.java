/**
 * Adapter Class to to Ghost.java
 * as a wrapper class
 * @author	William McGrew
 * @revised	31 October 2016
 */ 
 
 public class Geist {
	 private Ghost myGhost;
	 
	 /**
	 * Constructor built the same as Ghost
	 **/
	 public Geist(String name) {
		 myGhost = new Ghost(name);
	 }//end Constructor
	 /**
	 * calls myGhost.haunt 
	 **/
	 public void herumgeistern() {
		 myGhost.haunt();
	 }//end method herumgeistern
	 /**
	 * Calls myGhost scare method
	 **/
	 public void erschrecken() {
		 myGhost.scare();
	 }
 }// end class Geist