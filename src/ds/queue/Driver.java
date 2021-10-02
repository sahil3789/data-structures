package queue;

public class Driver {

	
	public static void main(String args[]) {
	
		Queue queue = new Queue(100);
		
		//insert and element at the rear of the queue if size < MAX_SIZE
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		//print the queue
		queue.printqueue();
		
		//remove an element from the front of the queue if not empty
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		//prints the queue 
		queue.printqueue();
		
		//returns true if queue is empty, else returns false 
		System.out.println(queue.isEmpty());
		
		//returns front element of the queue, if empty returns -1
		System.out.println(queue.peek());
		
		
		//searches for an element and returns its index (0 indexing) if found, else returns -1
		System.out.println(queue.search(4));
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		queue.printqueue();
		System.out.println(queue.search(5));
	}
	
}
