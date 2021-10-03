package linkedlist;

public class Driver {
	
	public static void main(String args[]) {
	
	
		LinkedList list = new LinkedList();
		
		//add data to the front of the list
		list.addfront(10);
		list.addfront(20);
		list.addfront(30);
		list.addfront(40);
		list.addfront(50);
		list.printlist();
		
		
		//add value to the end of the list
		list.addend(70);
		list.addend(80);
		list.addend(90);
		list.addend(100);
		list.addend(110);
		
		//print the list
		list.printlist();
		
		//add a node at any position : (1-indexing,data)
		list.addposition(3,55);
		list.printlist();
		
		//delete a node by specifying its position : (1-indexing)
		list.deleteposition(5);
		list.printlist();
		
		//search for a node by value
		list.search(20);
	
	}
	
}



