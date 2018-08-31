import java.util.ArrayList;
/**
 * Searching and Sorting
 * a class that implements the linear
 * search algorithm using a genric method.
 *
 * @author	William S. McGrew
 * @version	10/3/16
 */
 public class LinearSearch
 {
	 /**
	 * Performs a linear search on the ArrayList passed as argument.
	 * @parm  list  ArrayList
	 * @parm  key   the search key
	 * @return  the index of the key if fouind, otherwise -1
	 **/
	 public static <T extends Comparable<T>> int linearSearch(ArrayList<T> list, T key) {
		 int index = -1;
		 for (int i = 0; i < list.size(); i++) {
			 if (key.compareTo(list.get(i)) == 0) {
				 index = i;
				 break;
			 }//end if statement
		 }// end for loop
		 return index;
	 }//end method linearSearch
 }//end class LinearSearch