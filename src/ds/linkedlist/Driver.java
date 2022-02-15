package ds.linkedlist;

public class Driver {
	
	public static void main(String args[]) {
	
	
		LinkedList list = new LinkedList();
		
		//add data to the front of the list
		list.addFront(10);
		list.addFront(20);
		list.addFront(30);
		list.addFront(40);
		list.addFront(50);
		list.printList();
		
		
		//add value to the end of the list
		list.addEnd(70);
		list.addEnd(80);
		list.addEnd(90);
		list.addEnd(100);
		list.addEnd(110);
		
		//print the list
		list.printList();
		
		//add a node at any position : (1-indexing,data)
		list.addPosition(3,55);
		list.printList();
		
		//delete a node by specifying its position : (1-indexing)
		list.deletePosition(5);
		list.printList();
		
		//search for a node by value
		list.search(20);
	
	}
	
}



