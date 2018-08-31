import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 * Writting a class using Generic Collections
 * by implementing Several different
 * Data Structures/ API
 * 
 * @author	William McGrew
 * @version	19 September 2016
 */ 
 public class IntegerList
 {
	 public static void main(String[] args){
		 Integer[] numbers = {7, 2, 5, 9, 4, 10, 21, 31, 6, 19, 2, 32, 21,};
		 LinkedList<Integer> data = new LinkedList<>(Arrays.asList (numbers));
		 
		 /**
		 *iterate throgh data with for loop
		 **/
		 for(int i = 0; i < data.size(); i++) {
			 if((data.get(i) % 2) == 0) {
				 System.out.println("Removing " + data.get(i) + " from list.");
				 data.remove(i);
				 i--;
			 } else {
				 System.out.println(data.get(i));
			 }// end <for/else> loop 
		}
			 
		/**
		*iterate through data with while loop
		**/
		 data = new LinkedList<Integer>(Arrays.asList(numbers));
		 ListIterator<Integer> iterator = data.listIterator(0);
		 while (iterator.hasNext()){
			 Integer nextInt = iterator.next();
			 if ((nextInt % 2) == 0) {
				 System.out.println("Removing" + nextInt + " from list.");
				 iterator.remove();
			 } else {
				 System.out.println(nextInt);
			 }
		 }// end while loop
		 
		 /**
		 * Iterate with an enhanced for loop
		 * **throws an exception because it
		 * builds an iterator FOR the data structre
		 **/
		 data = new LinkedList<Integer>(Arrays.asList(numbers));
		 for (Integer currentInt : data) {
			 if((currentInt % 2) == 0) {
				 System.out.println("Removing " + currentInt + " from list.");
				 data.remove(currentInt);
			 } else {
				 System.out.println(currentInt);
			 }// end <for/else> loop 
		 }
	
	
	}//end main method
 }//end IntegerList