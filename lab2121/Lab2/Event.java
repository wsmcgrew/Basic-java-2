import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.Serializable;

/**
 * Implements entries for the <code>Calendar</code> class. Each
 * <code>Event</code> has fields indicating different pieces of
 * information about the event, e.g., location, time, etc. 
 *
 * @author	Your_Name_Here
 * @version	Date_Last_Modified_Here
 */ 
public class Event implements Serializable
{

    private String name;
    private SimpleDateFormat dateFormat;
    private Date date;
    private String location;
    private String description;

    /**
	 * Constructor
	 *
	 * @param	name		name of the Event
	 * @param	date		date of the Event
	 * @param	location	location of the Event
	 * @param	description	description of the Event
	 */ 
	public Event( String name, String date, String location, String description )
    {
        this.name = name;
		// Set the format for the date.
        this.dateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm" );
        
		// Format the date. 
        try
        {
            this.date = dateFormat.parse( date );
        }
        catch( ParseException e )
        {
            System.out.println( "Date unparseable using" + this.dateFormat );
        }

        this.location = location;
        this.description = description;

    }

    /**
	 * Returns the <code>Event</code>'s name. 
	 *
	 * @return	this.name
	 */ 
	public String getName()
    {
        return this.name;
    }

    /**
	 * Returns the <code>Event</code>'s date.
	 *
	 * @return	this.date
	 */ 
	public String getDate()
    {
        return this.date.toString();
    }

	/**
	 * Returns the <code>Event</code>'s location.
	 *
	 * @return	this.location
	 */ 
    public String getLocation()
    {
        return this.location;
    }

	/**
	 * Return's the <code>Event</code>'s description.
	 * 
	 * @return	this.description
	 */ 
    public String getDescription()
    {
        return this.description;
    }
	
	/**
	 * Returns String representation of the <code>Event</code>. 
	 * 
	 * @return	String containing fields of Event
	 */ 
	@Override
    public String toString()
    {
        String obj = "Name: " + this.getName() + "\nDate: " + this.getDate() + "\nLocation: " + this.getLocation() + "\nDescription: " + this.getDescription();

        return obj;
    }

}