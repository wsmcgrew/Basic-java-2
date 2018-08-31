import java.lang.ArithmeticException; 

/**
 * A class to model a fraction. Methods include add, 
 * subtract, multiply, divide, toString, and the 
 * appropriate getters.
 *
 * @author 	William S McGrewq
 * @version 22 August 2016 at 5:00
 */ 
public class Fraction {
	private int numerator; 
	private int denominator; 
	
	/**
	 * Constructor
	 * 
	 * Initializes numerator and denominator to values passed 
	 * as arguments. 
	 * 
	 * @param	numerator	the new Fraction's numerator
	 * @param	denominator	the new Fraction's denominator
	 */ 
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator; 
		this.denominator = denominator; 
	} // end constructor
	
	
	/** Getter Numerator
	 * 	
	 *allows the state of object to be called
	 *
	 *@return this.denominator
	 */ 
	public int getNumerator() {
		return this.numerator; 
	} // end method getNumerator
	
	
	/**Getter Denominator
	 * 
	 *allows state of object to  be called
	 *
	 *@return this.denominator
	 */ 
	public int getDenominator() {
		return this.denominator; 
	} // end method getDenominator
	
	
	/**Add Method
	 * 
	 *add numerator and denominator
	 *
	 *@
	 */ 
	public Fraction add(Fraction otherFraction) {
		int commonDenominator = this.denominator * otherFraction.denominator; 
		int sumNumerator = (this.numerator * otherFraction.denominator) + (otherFraction.numerator * this.denominator); 
		return new Fraction(sumNumerator, commonDenominator); 
	} // end method add
	
	
	/**
	 * 
	 */ 
	public Fraction subtract(Fraction otherFraction) {
		int commonDenominator = this.denominator * otherFraction.denominator; 
		int differenceNumerator = (this.numerator * otherFraction.denominator) - (otherFraction.numerator * this.denominator); 
		return new Fraction(differenceNumerator, commonDenominator); 		
	} // end method subtract 
	
	
	/**
	 * 
	 */ 
	public Fraction multiply(Fraction otherFraction) {
		int prodNumerator = this.numerator * otherFraction.numerator; 
		int prodDenominator = this.denominator * otherFraction.denominator; 
		return new Fraction(prodNumerator, prodDenominator); 
	} // end method multiply 
	
	
	/**d
	 * @throws:
	 */ 
	public Fraction divide(Fraction otherFraction) throws ArithmeticException {
		// Attempted division by zero. 
		if (otherFraction.numerator == 0) {
			throw new ArithmeticException("Division by zero is undefined."); 
		} 
		
		// Valid fraction passed as parameter. 
		else {
			// Create inverse of divisor. 
			Fraction inverse = new Fraction(otherFraction.denominator, otherFraction.numerator); 
			// Multiply dividend by inverse of divisor. 
			return this.multiply(inverse); 
		} 
	} // end method divide
	
	
	/**
	 * 
	 */ 
	@Override
	public String toString() {
		return this.numerator + " / " + this.denominator; 
	} // end method toString
} // end class Fraction