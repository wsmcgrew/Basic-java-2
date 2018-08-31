import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 * Class to campare two seperate strings
 * and sort them regarding Aphabetical order.
 * Utilizing Recursion
 * 
 * @author	William McGrew
 * @version	29 September 2016
 */ 
 public class Aphabetical
 {
	 
	 /**
	 * Class to compare 2 strings and return an integer
	 * @param -- [String a, b] [compare two strings based on recursion]
	 * @ensure -- an Int type determinig the differences
	 **/
	 public static int compareTo(String a, String b){
			 
			 //base case
		if(a.equals(b)) {
			return 0;
		}
			 else if (a.charAt(0) < b.charAt(0)) {
				 return -1;
			 } else if (a.charAt(0) > b.charAt(0)){
				 return 1;
			 } else {
					 // a recursion of the next letter in the string
					 return compareTo(a.substring(1, a.length() - 1), b.substring(1, a.length() - 1));
			 }
	 }//end method compareTo
	 
	 /**
	 * Finding the order in which the first
	 * string argument (via indirect recursion) comes after
	 * the second
	 *
	 *@parm -- [ArrayList, two indexes] [check which
	 * comes first in alphabet]
	 *@ensure -- [String] [returned to client]
	 **/
	 
	public static String findMinimum(ArrayList<String> stringsArray, int i, int j){
		//checking base case
		if (compareTo(stringsArray.get(i), stringsArray.get(j)) <= -1){
			return findMinimum(stringsArray, i, j);
		} else if (compareTo(stringsArray.get(i), stringsArray.get(j)) == 0){
			return findMinimum(stringsArray, i, j);
		} else {
			return stringsArray.get(i);
		}

	}//end method findMinimun
}//end class Aphabetical
