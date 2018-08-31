import java.util.Scanner; 
import java.util.Formatter; 
import java.io.File; 
import java.io.FileNotFoundException; 

/**
 * Creates a new file to contain the first sentence pulled from 
 * the declaration.txt file. declaration.txt should be located
 * in the current working directory. test.txt will be created in
 * the current working directory. 
 *
 * @author	William McGrew	
 * @version	24 October 2016
 */ 
public class SentenceExtractor {
	private static Scanner input; 		// Scanner to read from file. 
	private static Formatter output; 	// Formatter to write to file. 

	public static void main(String[] args) {
		// Create Scanner to read from declaration.txt. 
		initializeScanner(); 
		
		// Create a Formatter to write to test.txt. 
		initializeFormatter(); 
		
		// Read in the entire file as a string. 
		String declaration = " ";
		while (input.hasNextLine()) {
			declaration += input.nextLine() + " ";
		}
		//System.out.println(declaration);
		
		// Tokenize the declaration at ".".
		String[] tokens = declaration.split("\\.");
//		for (String token : tokens) {
//			System.out.println(token);
//		}
		
		// Save the first sentence. 
		String sentence = tokens[0] + ",";
		
		// Write first sentence to the file. 
		output.format(sentence);
//		System.out.println(sentence);
		
		// Close both the Scanner and the Formatter. 
		input.close(); 
		output.close(); 
	} // end method main 
	
	/**
	 * Initializes the static Scanner variable to read from 
	 * declaration.txt. File must be contained in the 
	 * current working directory. 
	 */ 
	private static void initializeScanner() {
		try {
			input = new Scanner(new File("declaration.txt"));
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("Could not open declaration.txt"); 
			e.printStackTrace(); 
		} 
	} // end method initializeScanner
	
	/**
	 * Initializes the static Formatter variable to write to 
	 * test.txt. The file will be contained in the current
	 * working directory. 
	 */ 
	private static void initializeFormatter() {
		try {
			output = new Formatter(new File("test.txt"));
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("Could not open test.txt"); 
			e.printStackTrace(); 
		} 		
	} // end method initializeFormatter
} // end class SentenceExtractor