package ds.queue;

public class Driver {

	
	public static void main(String args[]) {
	
		Queue queueobj = new Queue(100);
		
		//remove from an empty queue
		queueobj.dequeue();
		
		//insert and element at the rear of the queue if size < MAX_SIZE
		queueobj.enqueue(1);
		queueobj.enqueue(2);
		queueobj.enqueue(3);
		queueobj.enqueue(4);
		queueobj.enqueue(5);
		
		//print the queue
		queueobj.printQueue();
		
		//remove an element from the front of the queue if not empty
		queueobj.dequeue();
		queueobj.dequeue();
		queueobj.dequeue();
		queueobj.dequeue();
		queueobj.dequeue();
		
		//prints the queue 
		queueobj.printQueue();
		
		//returns true if queue is empty, else returns false 
		System.out.println(queueobj.isEmpty());
		
		//returns front element of the queue, if empty returns -1
		System.out.println(queueobj.peek());
		
		
		//searches for an element and returns its index (0 indexing) if found, else returns -1
		System.out.println(queueobj.search(4));
		
		queueobj.enqueue(1);
		queueobj.enqueue(2);
		queueobj.enqueue(3);
		queueobj.enqueue(4);
		queueobj.enqueue(5);
		
		queueobj.printQueue();
		System.out.println(queueobj.search(5));
	}
	
}
