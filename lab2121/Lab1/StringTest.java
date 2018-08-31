import org.junit.Before; 
import org.junit.Test;
import static org.junit.Assert.*; 

/**  
 * A test class for a few of the methods for   
 * Java’s <code>String</code> class.  
 *  
 * @author  William McGrew
 * @version 25 August 2016
 */ 
public class StringTest {
    // The Strings to test. 
    private String letters; 
    private String numbers; 
    private String empty; 
    private String simpleSentence; 
    private String complexSentence; 
    
	/**
	 * Initializes test fixtures before each test
	 * is run. 
	 */ 
    @Before
    public void setUp() {
        letters = new String("abcdefg"); 
        numbers = new String("1234567"); 
        empty = new String(""); 
        simpleSentence = new String("This is a sentence.\n"); 
        complexSentence = new String("%Punctuation!, Can cr\te8 <problems.$"); 
    } // end method setUp
    
	/**
	 * Tests the <code>length()</code> method of 
	 * <code>String</code>.
	 */ 
    @Test
    public void testLength() {
        assertTrue( letters.length() == 7 ); 
        assertTrue( numbers.length() == 7 ); 
        assertTrue( empty.length() == 0 ); 
        assertTrue( simpleSentence.length() == 20 ); 
        assertTrue( complexSentence.length() == 36 );
    } // end method testLength
    
	/**
	* Tests <code>String</code> class’s <code>equals()</code> 
	* method.
	*/
	@Test
	public void testEquals() {
		assertTrue(letters.equals("abcdefg"));
		assertTrue(numbers.equals("1234567"));
		assertTrue(empty.equals(""));
		assertTrue(simpleSentence.equals("This is a sentence.\n"));
		assertTrue(complexSentence.equals("%Punctuation!, Can cr\te8 <problems.$"));
	} // end method testEquals

	/**
	 * Tests the <code>toLowerCase</code> method of 
	 * <code>String</code>. 
	 */ 
	@Test
    public void testToLowerCase() {
        /* Stubbed--we'll write these tests in class.*/ 
    } // end method testToLowerCase
} // end class TestString