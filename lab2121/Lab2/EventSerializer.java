import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;

/**
 * Creates instances of Event and stores them as local 
 * variables in main. Serializes the Events, empties the
 * ArrayList of stored Events and then deserializes the 
 * saved Events. 
 *
 * @author	WIlliam McGrew
 * @version	8/30/16
 */ 
public class EventSerializer {
    public static void main(String[] args) {
		ArrayList<Event> events = new ArrayList<Event>(); // List of Events to process.
		ObjectOutputStream output = null;
		ObjectInputStream input = null;

		
		// Add two new events to the Calendar. 
        events.add(new Event( "Redmann's Party", "2014-03-03 22:00", "Redmann's House", "Come pass a good time" ));
        events.add(new Event( "CSCI 2120 Test", "2014-03-24 16:30", "MATH 226", "2nd Test" ));
		
		
		/* Serialize the Event objects from the ArrayList for storage. */ 
		// Open the output stream for object serialization. 
		try{
			output = new ObjectOutputStream(new FileOutputStream("myEvents.ser"));
		} catch (IOException e) {
			System.out.println("Error opening file to write.");
			System.exit(1);//terminate and notified OS of exception
		}
		// Serialize the Event objects and write them to the file. 
		try{
			for(Event event : events) {
				output.writeObject(event);
			}
		} catch (IOException e){
			System.out.println("Error opening file to write.");
			System.exit(1);
		}
		// Close the output stream. 
		try {
			output.close();
		} catch (IOException e) {
			System.out.println("Error closing file to write.");
			System.exit(1);
		}
		
		// Empty the ArrayList to see if serialization worked. 
		events.clear(); 
		
		
		/* Deserialize the stored Events and add them to the ArrayList. */ 
		// Create the input stream to deserialize Events. 
		try {
			input = new ObjectInputStream(new FileInputStream("myEvents.ser"));
		} catch (IOException e) {
			System.out.println("Error opening file to read");
			System.exit(1);
		}
		// Deserialize the Event objects and add them to ArrayList. 
		try {
			while (true){//Infinate loop until EOFException (end of file)
			events.add((Event) input.readObject());
			}
		} catch (EOFException e) {
			System.out.println("read all serialized Events.");
		} catch (ClassNotFoundException e) {
			System.out.println("No Events Found");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Error reading file");
			System.exit(1);
		}
		// Close the file containing the serialized Events. 
		try {
			input.close();
		} catch (IOException e) {
			System.out.println("Error while closing input.");
			System.exit(1);
		}
		// Print the Events. 
		for (Event event : events) {
			System.out.println(event.toString());
			System.out.println(); 
		}
    } // end method main
} // end class Calendar