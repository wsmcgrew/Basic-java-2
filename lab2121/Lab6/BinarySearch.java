import java.util.ArrayList;
/**
 * Searching and Sorting
 * a class that implements the recursive
 * selection sort algorithm in a static generic method.
 *
 * @author	William S. McGrew
 * @version	10/3/16
 */
 public class BinarySearch{	 
	 
	 /**
	 * Method that sends the integer being searched for and the 
	 * low starting index 
	 * @param  ArrayList int    for index and array
	 **/
	 public static <T extends Comparable<T>> void binarySearch (ArrayList<T> list, int currentIndex, T key) {
		 binarySearch(list, currentIndex, key);
		 }
	 
	 private static <T extends Comparable<T>> int binarySearch(ArrayList<T> input, int currentIndex, T key){
		 int low = 0;
		 int high = input.size() - 1;
		 int middle = (low + high + 1 )/ 2;
		 int location = -1;
		 
		if (key.compareTo(input.get(middle))== 0) {
			 location = middle;
			 return location;
		}	else if (key.compareTo(input.get(middle)) > 0) {
				return binarySearch(input, currentIndex - 1, key);
			} else {
			return binarySearch(input, currentIndex + 1, key);}	
		 /**do {
			for (int i = 0; i < middle; i++){
					if (index == list(middle))
							location = middle;
						else if (index < list.get(middle))
							high = middle - 1;
						else 
							low = middle +1;
			 
		 }while ((low <= high) && (location == -1));//end do/while loop**/
	 }//end method binarySearch
	 
	 
 }//end class BinarySearch