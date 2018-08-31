import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
* A test class for Aphabetical recursion
* of a <code>String<code/> class organizing
* two strings via Aphabetical Order.
*
* @author William McGrew
* @verson 28 September 2016
**/
public class AphabeticalTest{
	//TestFixtures
	private String str1;
	private String str2;
	private ArrayList<String> group;
	
	/**
	* Initializes the <code>test fixtures<code/>
	* before the two tests
	*/
	@Before
	public void setUp(){
		str1 = new String("Lamp");
		str2 = new String("Lamb");
		//building ArrayList and adding 2 Strings
		group = new ArrayList<String>();
		group.add("Charlie");
		group.add("Charles");
	}//end SetUp method
	
	@Test
	public void testCompareTo(){
		assertTrue(str1.equals("Lamp"));
		assertTrue(str2.equals("Lamb"));
		assertFalse(str1.equals(str2));
	}//end TestAph method
	
	/*
	* Test's the lower in the alphabet from an
	* <code>ArrayList<String><code/>
	*/
	@Test
	public void testMin(){
		assertEquals(group.size(), 2);
		assertEquals(group.get(0), "Charlie");
		assertEquals(group.get(1), "Charles");
	}//end method testMin
	
}// end class AphabeticalTest