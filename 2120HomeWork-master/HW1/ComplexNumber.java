import java.lang.ArithmeticException;


/**
 * Creates instances of Event and stores them as local 
 * variables in main. Serializes the Events, empties the
 * ArrayList of stored Events and then deserializes the 
 * saved Events. 
 *
 * @author	William McGrew
 * @version	8/30/16
 */ 
 
public class ComplexNumber {
	//ComplexNumbers a and b
	private float a;
	private float b;
	
	/**constructor 
	*initializes the instance variable
	*@param a float type
	*@parm b float type
	**/
	
	public ComplexNumber(float a, float b){
		this.a = a;
		this.b = b;
	}
	/**Returns state of a
	*
	*@return float a
	**/
	public float getA(){
		return this.a;
	}
	/**Returns state of b
	*
	*@return float b
	**/
	public float getB(){
		return this.b;
	}
	
	/**Addition 
	*
	*Adds the complex numbers and returns
	*a complex number
	*
	*@param a ComplexNumber Refrence
	*@ensure  Sum of two ComplexNumbers**/
	public ComplexNumber add(ComplexNumber theNumber){
		ComplexNumber newComplex;
		float newA = a + theNumber.getA();
		float newB = b + theNumber.getB();
		newComplex = new ComplexNumber (newA, newB);
		return newComplex;
	}
	
	/**Subtraction two complex numbers
	*
	* Subtracts two seperate numbers
	*
	*@parm complex number type
	*@ensure a subtracted ComplexNumber
	**/
	public ComplexNumber subtract(ComplexNumber theNumber){
		ComplexNumber newComplex;
		float newA = a - theNumber.getA();
		float newB = b - theNumber.getB();
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	}
	
	/**Multiplication
	*
	* Take two complex Numbers
	* multiply the 'a's and 'b's subtract, add
	*
	*@parm a complex number
	*@ensure a multiplyed comlex number
	**/
	
	public ComplexNumber multiply(ComplexNumber theNumber){
		ComplexNumber newComplex;
		float newA = (a * theNumber.getA()) - (b * theNumber.getB());
		float newB = (b * theNumber.getA()) + (a * theNumber.getB());
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	}
	
	/** Division
	*@thows: division by zero
	*
	* Divide two seperat numbers
	*
	* @param a complex number type
	* @ensure a complex number
	**/
	
	public ComplexNumber divide(ComplexNumber theNumber) throws ArithmeticException{
		//if a number is zero
		if (theNumber.getA() == 0 || theNumber.getB() == 0){
			throw new ArithmeticException("Division by Zero isn't possible");
		}else{
			ComplexNumber newComplex;
			float newA = (a *theNumber.getA()) + (b * theNumber.getB());
			float newB = (theNumber.getA() *theNumber.getA()) + (theNumber.getB() *theNumber.getB());
			float newC = (b * theNumber.getA()) - (a * theNumber.getB());
			float newD = (theNumber.getA() *theNumber.getA()) + (theNumber.getB() *theNumber.getB());
			
			float sumA = newA / newB;
			float sumB = newC / newC;
				
			newComplex = new ComplexNumber(sumA, sumB);
			return newComplex;
		}
	}
	/**Equals method
	*
	* overriding Object equals method
	*
	* @parm ComplexNumber type
	* @ensure boolean expresion
	**/
	public boolean equals(Object test){
		boolean answer = false;
		if(test instanceof ComplexNumber){
				return true;
		}else{
			return false;
		}
	}
	
	/**ToString method
	* 
	* @return a string of ComplexNumbers
	**/
	@Override
	public String toString(){
		return this.a + "," + this.b;
	}
}//end class complex numbers