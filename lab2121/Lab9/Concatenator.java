/**
* Concatenate a string using a helper method
* and cration of a StringBuilder to modify the testString
* 
* @author	William McGrew
* @version	24 October 2016
**/
public class Concatenator {
	
	public static void main(String[] args){
		String testString = "This is a test String";
		System.out.println(testString);
		stringModifier(testString);
		System.out.println(testString);
		
		StringBuilder buffer = new StringBuilder(testString);
		System.out.println(buffer);
		stringModifier(buffer);
		System.out.println(buffer);
	}//end main method
	/**
	* modifies a String being passed as argument
	* @param String to be modified
	**/
	private static void stringModifier(String text) {
		text += " that has been modified";
		System.out.println(text);
	}//end method stringModier
	/**
	* Modifies a string using StringBuilder
	* @parm 	StringBuilder
	**/
	private static void stringModifier(StringBuilder buffer) {
		buffer.append(" that has been modified");
		System.out.println(buffer);
		
	}//end method stringModifier
}// end class concatenator 