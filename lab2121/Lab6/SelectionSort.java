import java.util.ArrayList;
/**
 * Searching and Sorting
 * a class that implements the recursive
 * selection sort algorithm in a static generic method.
 *
 * @author	William S. McGrew
 * @version	10/3/16
 */
 public class SelectionSort {
	/**
	* Swaps two index's with the help of a temp
	* @parm  list  ArrayList
	* @parm  ints  ints to represent the tow indexs
	**/
	private static <T extends Comparable<T>> void swap(ArrayList<T> list, int firstIndex, int secondIndex) {
		T temp = list.get(firstIndex);
		list.set(firstIndex, list.get(secondIndex));
		list.set(secondIndex, temp);
	}//end method swap
	/**
	* Find the minimum in the ArrayList
	* @parm  list  ArrayList
	* @parm  int  the starting index
	**/
	private static <T extends Comparable<T>> int findMinimum(ArrayList<T> list, int startIndex){
		int lowestIndex = startIndex;
		for (int i = startIndex; i < list.size(); i++) {
			if (list.get(i).compareTo(list.get(lowestIndex)) < 0) {
				lowestIndex = i;
			}//end if
		}//end for loop
		return lowestIndex;
	}//end method findMinimum
	/**
	* method to set the start index to the overloaded method
	* @parm list  ArrayList
	**/
	public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
		sort(list, 0);
	} //end class sort
	/**
	*@require list.size() >= 1
	**/
	private static <T extends Comparable<T>> void sort(ArrayList<T> list, int startIndex) {
		if (startIndex < list.size() - 1) {
			int minIndex = findMinimum(list, startIndex);
			swap(list, startIndex, minIndex);
			sort(list, startIndex + 1);
		}
	}//end method sort overload
 
 }//end class SelectionSort