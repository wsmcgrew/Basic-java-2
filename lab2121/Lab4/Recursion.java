/**
 * Recursion 
 * 
 *
 * @author	William S. McGrew
 * @version	9/12/16
 */ 
 public class Recursion{
	 
	 /**Recursion factiorial of number
	 *
	 * @parm and int number
	 * @require an integer
	 **/
	 public static int factorial(int n){
		 //base case
		 if(n == 0){
			 return 1;
		 } else {
			 return n * factorial(n-1);
		 }
	 }
	 /**Recursion Fibonacci
	 *
	 * @parm number to be broken down
	 * @require an integer
	 **/
	 
	 public static int fibonacci(int n){
		//base case
		if((n == 0) || (n == 1)){
			return n;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	 }
	 
	 public static int tailFactorial(int n) {
		 return tailFactorial(n, 1);
		 
	 }
	 
	 private static int tailFactorial(int n, int product){
		 
		 if ( n == 0) {
			 return product;
		 } else {
			 return tailFactorial(n - 1, product * n);
		 }
	 }
	 
 }//end class recursion