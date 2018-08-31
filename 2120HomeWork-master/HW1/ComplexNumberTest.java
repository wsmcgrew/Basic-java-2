import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Creates instances of Event and stores them as local 
 * variables in main. Serializes the Events, empties the
 * ArrayList of stored Events and then deserializes the 
 * saved Events. 
 *
 * @author	William McGrew
 * @version	8/30/16
 */ 
 
 public class ComplexNumberTest{
	 
	 private ComplexNumber c1;
	 private ComplexNumber c2;
	 private ComplexNumber c3;
	 
	 /**Setup 
	 *
	 * setup two Complex numbers to test
	 **/
	 @Before
	 public void setup(){
		 c1 = new ComplexNumber(1.50f, 2.50f);
		 c2 = new ComplexNumber(0.75f, 1.75f);
	 }
	 
	 /** Test the qwery method
	 *
	 *testing the getters in ComplexNumber class
	 **/
	 @Test
	 public void getMethods(){
		 assertEquals(1.50f, c1.getA(), 0.000001f);
		 assertEquals(2.50f, c1.getB(), 0.000001f);
		 assertEquals(0.75f, c2.getA(), 0.000001f);
		 assertEquals(1.75f, c2.getB(), 0.000001f);
	 }
	 /**Add complex numbers
	 *
	 *add two complex numbers
	 *
	 *@require two complex numbers in scope of class
	 **/
	 
	 @Test
	 public void addNumbers(){
		 ComplexNumber test = c1.add(c2);
		 
		 assertEquals(2.25f, test.getA(), 0.00000f);
		 assertEquals(4.25f, test.getB(), 0.000001f);
	 }
	 /**Subtract complex numbers
	 *
	 *subtract two complex numbers
	 *
	 *@require two complex numbers in scope of class
	 **/
	 @Test
	 public void subtractNumbers(){
		 ComplexNumber test = c1.subtract(c2);
		 
		 assertEquals(0.75, test.getA(), 0.000001f);
		 assertEquals(0.75, test.getB(), 0.000001f);
	 }
	 /**Multiply complex numbers
	 *
	 *Multiply two complex numbers
	 *
	 *@require two complex numbers in scope of class
	 **/
	 @Test
	 public void multiplyNumber(){
		 ComplexNumber test = c1.multiply(c2);
		 
		 assertEquals(-3.25f, test.getA(), 0.000001f);
		 assertEquals(4.50f, test.getB(), 0.000001f);
	 }
	 /**Divide complex numbers
	 *
	 *Divide two complex numbers
	 *
	 *@require two complex numbers in scope of class
	 **/
	 @Test
	 public void divideNumber(){
		 ComplexNumber test = c1.divide(c2);
		 
		 assertEquals(1.517241358757019f, test.getA(), 0.000001f);
		 assertEquals(1.00f,test.getB(), 0.000001f);
	 }
	 
	 //@Test
	 //public void testException(){}
	 
	 /**Equals() override 
	 * test the equals method
	 * @require two ComplexNumbers for comparison 
	 **/
	 @Test
	 public void test_Equals(){
		 
		 assertTrue("ComplexNumber are same Equal", c1.equals(c1));
	 }
 }//end class ComplexNumberTest