import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import java.lang.ArithmeticException; 
import static org.junit.Assert.*;
/**
 * A class to to test a modeled fraction 
 * class that includes Add, Subtract, Multiply
 *and Divide with an possible exception being thrown.
 *
 * @author 	William S McGrew
 * @version 24 August 2016 at 5:00**/
 

public class FractionTest {
	// The Strings to test.
	private Fraction f1;
	private Fraction f2;
	private Fraction f3;

	@Before
	public void setup(){
		f1 = new Fraction(1, 2);
		f2 = new Fraction(3, 4);
		f3 = new Fraction(1, 0);
	}//end method setup 
	/**
        * Tests class's getterNumerator/Denominator() methods.
        */
    @Test
    public void getterMethods() {
		assertEquals("true", f1.getNumerator(), 1);
		assertEquals("True", f1.getDenominator(), 2);
		assertEquals("True", f2.getNumerator(), 3);
		assertEquals("True", f2.getDenominator(), 4);
		assertEquals("True", f3.getNumerator(), 1);
		assertEquals("True", f3.getDenominator(), 0);
    }
		
		/**
		*Test class's Add method.
		**/
	@Test
	public void addTest(){
		Fraction f1addf2 = f1.add(f2);
		//Fraction f3addf3 = f3.add(f3);
		
		assertEquals(10, f1addf2.getNumerator());
		assertEquals(8, f1addf2.getDenominator());
	}
		
    @Test
    public void subtractTest() {
		Fraction f1subf2 = f1.subtract(f2);
		
		assertEquals(-2, f1subf2.getNumerator());
		assertEquals(8, f1subf2.getDenominator());
	}
	@Test	
	public void multiplyTest(){
		Fraction f1mulf2 = f1.multiply(f2);
		
		assertEquals(3, f1mulf2.getNumerator());
		assertEquals(8, f1mulf2.getDenominator());
	}
	@Test	
	public void divideTest(){
		Fraction f1divf2 = f1.divide(f2);
		
		assertEquals(4, f1divf2.getNumerator());
		assertEquals(6, f1divf2.getDenominator());
	}
	/**@Test(expected = IndexOutOfBoundsException.class)
	public void exceptionTest() {
		try {
			double a = 10/0;
			assertFail("Failed: Should get an IndexOutOfBoundsException"); 
		}
		catch (ArithmeticException e) {
			// Assert that this exception is thrown as expected
			assertEquals("Divide by zero", e.getMessage());
		}
		throw new IndexOutOfBoundsException();
	}**/
	@Test(expected=java.lang.ArithmeticException.class)
		public void testDivide() {
			   double zero = 10 / 0;
		}
} // end class FractionTest