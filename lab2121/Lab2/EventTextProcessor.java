import java.util.ArrayList; 

/**
 * Creates instance of Event and stores them as local 
 * variables in main. Reads text from file, parses it, 
 * and creates Events based on it. Writes Events out 
 * to a text file. 
 *
 * @author	Your_Name_Here
 * @version	Date_Last_Revised
 */ 
public class EventTextProcessor {
    public static void main(String[] args) {
		ArrayList<Event> events = new ArrayList<Event>(); // List of Events to process. 

		
		// Add two new events to the Calendar. 
        events.add(new Event( "Redmann's Party", "2014-03-03 22:00", "Redmann's House", "Come pass a good time" ));
        events.add(new Event( "CSCI 2120 Test", "2014-03-24 16:30", "MATH 226", "2nd Test" ));
		
		/* Create Events from info contained in a text file. */ 
		//Open a buffered character-based stream to read Events from. 
		
		// Read Events from the text file and adds them to the ArrayList. 

		// Close the buffered character-based stream used to create Events.
		
		
		/* Write the Events in the ArrayList out to a text file. */
		// Open a text file for writing. 

		// Add the Events from the ArrayList to the text file. 
		
		// Close the text file. 
		
		
		// Print the Events. 
		for (Event event : events) {
			System.out.println(event.toString());
			System.out.println(); 
		}
    } // end method main
} // end class EventTextProcessor