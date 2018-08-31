import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;
import java.util.ListIterator;
import static org.junit.Assert.*;

/**
* JUnit test testing LinkedList, Iterator,
* Dog, and ListRunner
*
* @author William McGrew
* @version 19 October 2016
*/

public class ListRunnerTest {
	//TestFixture of one LinkedList
	private LinkedList<Dog> testOne;
	
    Dog fifi = new Dog("Fifi", 12, 8);
    Dog butch = new Dog("Butch", 10, 12);
    Dog leonard = new Dog("Leonard", 22, 16);
    Dog spot = new Dog("Spot", 17, 11);
	Dog rue = new Dog("Rue", 35, 12);
	
	@Before
	public void setUp() {
		//Initializing test fixture and adding
		//elements for initializaiton of Iterator and nodes
		testOne = new LinkedList<Dog>();
		
        testOne.add(fifi);
        testOne.add(butch);
        testOne.add(leonard);
        testOne.add(spot);
				
	}//end setUp method
	
	@Test
	public void testAdd(){
		testOne.add(rue);
		assertTrue("Rue", testOne.contains(rue));
	}
	
	@Test
	public void testContains() {
		assertFalse(testOne.isEmpty());
		assertTrue(testOne.contains(fifi));
		assertTrue(testOne.contains(butch));
		assertTrue(testOne.contains(leonard));
		assertTrue(testOne.contains(spot));
	}//end method testContains
	@Test
	public void testIndexOf() {
		int actual = testOne.indexOf(fifi);
			assertEquals(actual, 0);
		actual = testOne.indexOf(butch);
			assertEquals(actual, 1);
		actual = testOne.indexOf(leonard);
			assertEquals(actual, 2);
		actual = testOne.indexOf(spot);
			assertEquals(actual, 3);
	}//end method testIndexOf
}//end class ListRunnerTest