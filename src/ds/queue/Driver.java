package ds.queue;

public class Driver {

	public static void main(String args[]) {
	
		Queue queue = new Queue(100);
		
		//remove from an empty queue
	/*	try {
			queue.dequeue();
		}
		catch(QueueEmptyException e){
			e.showMessage();
		}
		*/
		//insert and element at the rear of the queue if size < MAX_SIZE
		try {
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.enqueue(4);
			queue.enqueue(5);
		}
		catch(QueueFullException e){
			e.showMessage();
		}
		//print the queue
		try {
			queue.printQueue();
		}
		catch (QueueEmptyException e){
			e.showMessage();
		}
		//remove an element from the front of the queue if not empty
		try {
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
		}
		catch(QueueEmptyException e){
			e.showMessage();
		}
		//prints the queue
		try {
			queue.printQueue();
		}
		catch(QueueEmptyException e)
		{
			e.showMessage();
		}
		//returns true if queue is empty, else returns false
		System.out.println(queue.isEmpty());

		//returns front element of the queue, if empty returns -1
		try {
			System.out.println(queue.peek());
		}
		catch(QueueEmptyException e){

			e.showMessage();
		}
		
		//searches for an element and returns its index (0 indexing) if found, else returns -1
		try {
			System.out.println(queue.search(4));
		}
		catch(QueueEmptyException e){
			e.showMessage();
		}

		try {
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.enqueue(4);
			queue.enqueue(5);
		}
		catch(QueueFullException e){
			e.showMessage();
		}
		try {
			queue.printQueue();
		}
		catch(QueueEmptyException e){
			e.showMessage();
		}
		try {
			System.out.println(queue.search(5));
		}
		catch(QueueEmptyException e){
			e.showMessage();
		}
	}
	
}
