import java.util.NoSuchElementException;

/**
A basic implimentation of a linked list
that uses an iterator to perform a new function.
@author William McGrew
@version 19 October 2016
*/
public class LinkedList<T>
{
	private Node head;
	
	public LinkedList()
	{
		this.head = null;
	}// end of LinkedList constructor
	/**
	A class that travels throught the LinkedList and adds nodes to the list.
	*/
	public class Iterator
	{
		private Node current;
		
		public Iterator()
		{
			this.current = LinkedList.this.head; 	
		}// end of Iterator constructor 
		
		/**
		*Returns whether or not there is another Node
		*in the LinkedListed.
		*@return whether there the current node has a current value.
		*/
		public boolean hasNext()
		{
			if (this.current != null)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}//end of method hasNext
		
		/**
		* Returns the current nodes' data and if it had data, it 
		* saved the value to a local variable.
		* If the list contains no more Nodes, it throws the NoSuchElementException.
		* @throws NoSuchElementException
		* @return the current nodes values
		*/
		public T next()throws NoSuchElementException
		{
			Node oldCurrent = this.current;
			if(this.current != null)
			{
				this.current = this.current.next;
				return oldCurrent.data;
			}
			else 
			{
				throw new NoSuchElementException("List is empty");
			}
		}//end of method next
		
		/**
		Adds a new node to the LinkedList through the Iterator class.
		@return nothing it is void
		*/
		public void add(T data)
		{
			Node newNode = new Node(data);
			
			//List is empty.
			if(LinkedList.this.head == null)
			{
				LinkedList.this.head = newNode;
			}
			else
			{
				while(this.current.next != null)
				{
					this.current = this.current.next;
				}
				this.current.next = newNode;
				this.next();
			}
		}//end of method add
	}//end of class Iterator
	/**
	A class that instanciates the data of the node and the next nodes data.
	*/
	private class Node
	{
		private T data;
		private Node next;
		
		public Node(T data)
		{
			this.data = data;
			this.next = null;
			
		}// end of Node constructor
	}//end of class Node
}// end of class LinkedList