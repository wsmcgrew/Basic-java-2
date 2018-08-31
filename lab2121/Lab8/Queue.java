
/**
 * A basic implimentation of a queue built on a circular array
 * @author	William McGrew
 * @revised 24 October 2016
 */ 
import java.util.NoSuchElementException;
public class Queue<T>
{
	private int head; //the index of the first element to remove
	private int tail; // the first available index to queue an element
	private int size; // the length of the array
	private T[] array;
	
	/**
	Constructor initializing array size to 5.
	*/
	@SuppressWarnings("unchecked")
	public Queue()
	{
		this.size = 5;
		this.head = this.tail = 0;
		array = (T[]) new Object[this.size];
		
	}// end of constructor
	/**
	Adds an element at the end of the queue .
	@param element the element to add
	*/
	public void enqueue(T element)
	{
		if (this.isFull())
		{
			this.resizeArray();
		}
		this.array[tail] = element;
		this.tail = (this.tail + 1) % this.size;
	}//end of method enqueue
	/**
	Returns whether or not the underlying array has an empty space.
	*/
	private boolean isFull()
	{
		if ((this.tail +1)%this.size == this.head)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}//end of method isFull
	/**
	Resize the underlying array to double the previous capacity.
	*/
	@SuppressWarnings("unchecked")
	private void resizeArray()
	{
		T[] temp = (T[])new Object[this.size * 2];
		int elementsCopied = 0;
		for (int i = this.head; i != this.tail; i= (i + 1)% this.size)
		{
			temp[elementsCopied] = this.array[i];
			elementsCopied++;
			
		}
		this.size *= 2;
		this.head = 0;
		this.tail = elementsCopied;
		this.array = temp;
	}//end method resizeArray
	/**
	A method that deletes the head index and re-assigns the head index to a new temp array. 
	*/
	public T dequeue()
	{
		if (this.isEmpty())
		{
			throw new NoSuchElementException("Queue is empty");
		}
		else 
		{
			T temp = this.array[this.head];
			this.head = (this.head +1)% this.size;
			return temp;
		}
	}//end of method dequeue
	/**
	A method that checks if the array is empty.
	*/
	private boolean isEmpty()
	{
		if(this.head == this.tail)
		{
			return true;
		}
		else 
		{
			return false ;
		}
	}//end of isEmpty
}//end of class Queue