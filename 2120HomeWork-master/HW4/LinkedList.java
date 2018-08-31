import java.util.ListIterator;
import java.util.NoSuchElementException;
/**
* A basic implimentation of a linked list
* that uses an iterator to perform a function.
*
* @author William McGrew
* @version 19 October 2016
*/

public class LinkedList<T>  {


    Node<T> itsFirstNode;
    Node<T> itsLastNode;
    private int size;

	//initializing first node (and last)
    public LinkedList() {

        itsFirstNode = null;
        itsLastNode = null;
        size = 0;
    }

    
    public Iterator<T> getIterator() {
        return new Iterator(this);
    }

    // THIS WILL NEED TO BE MODIFIED FOR DOUBLY LINKED LIST
	//modified to have a doubly linked list
    public void add(T element) {

        Node<T> node = new Node(element);

        if (itsFirstNode == null) {
            itsFirstNode = node;
            itsLastNode = node;
        }
        else {
            itsLastNode.setNextNode(node);
			node.setPriorNode(itsLastNode);
            itsLastNode = node;
        }
        size++;
    }//end add method 1

    // THIS WILL NEED TO BE MODIFIED FOR DOUBLY LINKED LIST
	//modified for doubly linked list
    public void add(T element, int index) {
        int counter = 0;
        Node<T> newNode = new Node(element);
        Node<T> current = itsFirstNode;
        while (current.getNextNode() != null ) {
            if (counter == index - 1 )
                break;
            current = current.getNextNode();
            counter++;
        }
        newNode.setPriorNode(current);
        current.setNextNode(newNode);
        size++;
    }// end add method 2

    public T get(int index) {

        int counter = 0;
        Node<T> current = itsFirstNode;
        while (current.getNextNode() != null ) {
            if (counter == index)
                break;
            current = current.getNextNode();
            counter++;
        }
        return current.getData();
    }
	
    // returns true if element is in the list, false if not
    public boolean contains(T element) {
		if (this.contains(element)){
			return true;
		} else {
			return false;
		}
    }//end method contains

    // returns the index of the element if it is in the list, -1 if not found
	//@ensure Type object  returns index of type object
    public int indexOf(T element) {
		int index = 0;;
		Node<T> current = new Node(itsFirstNode.getData());
		
		while (current != null) {
			if (current.getData() == element){
				return index;
			}
			index++;
			current = current.getNextNode();
		}
		return -1;
    }//end method indexOf

    // returns an Iterator at the location of the element if it is in the list
    // returns the null reference if the element is not found
	//@ensure the
   public Iterator<T> iteratorAt(T element) {
	   Iterator<T> trackIT = this.getIterator();
	   Iterator<T> iteratorAt = trackIT;
	   
		while (trackIT.hasNext()) {
			if(trackIT.next() == element)
				break;
			else
				iteratorAt.next();
	   }
	   
	   return iteratorAt;
    }//end iteratorAt

    public String toString() {
        String returnVal = "";
        Node<T> current = itsFirstNode;
        if (size != 0 ) {
            while (current.getNextNode() != null ) {
                returnVal += current.toString();
                returnVal += "\n";
                current = current.getNextNode();
            }
            returnVal += current.toString();
        }
        return returnVal;
    }  // end toString

    class Node<T> {
    
        private T data;
        private Node<T> itsNext;
        private Node<T> itsPrior;
    
        public Node(T data) {
            itsNext = null;
            itsPrior = null;
            this.data = data;
        }
    
    
        public T getData() {
            return this.data;
        }
    
        public Node<T> getNextNode() {
            return itsNext;
        }

        // TO BE IMPLEMENTED
        
        public Node<T> getPriorNode() {
			return itsPrior;
        }
    
        public void setNextNode(Node<T> next) {
            itsNext = next;
        }

        // TO BE IMPLEMENTED
        public void setPriorNode(Node<T> prior) {
			itsPrior = prior;
        }
    
        public String toString() {
            return data.toString();
        }
    
    }  // end of Node<T>
}
