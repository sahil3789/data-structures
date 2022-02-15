package ds.queue;

import java.util.logging.Level;
import java.util.logging.Logger;

class QueueEmptyException extends  Exception{

	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	void showMessage(){

		LOGGER.log(Level.WARNING,"Queue Empty");
	}

}

class QueueFullException extends  Exception{

	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


	void showMessage(){

		LOGGER.log(Level.WARNING,"Queue Full");
	}
}

class Queue {

	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	int max;
	int front;
	int rear;
	int[] queue;

	Queue(int maxValue){

		try {
		max = maxValue;
		front = -1;
		rear = -1;
		queue = new int[max];
		}
		catch(NegativeArraySizeException e) {

			LOGGER.log(Level.WARNING,"Queue size can't be negative");
			LOGGER.log(Level.INFO,"Stack of size 100 created");

			max=100;
			queue = new int[100];
			
		}
	}
	
	void enqueue(int data) throws QueueFullException{
		
		if(rear==max-1 || front>rear)
			throw new QueueFullException();
		else{
			queue[++rear] = data;
			if(front==-1)
				front++;
		}

	}
	
	void dequeue() throws QueueEmptyException {
		
		if(front>rear || front ==-1 && rear==front)
			throw new QueueEmptyException();
		else
			front++;
	}
	
	int peek() throws QueueEmptyException{
		
		if(front>rear)
			throw new QueueEmptyException();
		else
			return queue[front];
	}
	
	boolean isEmpty() {
		
		return (front==-1 && rear==front || front>rear);

	}
	
	void printQueue() throws QueueEmptyException{

		if(isEmpty())
			throw new QueueEmptyException();
		else
		{
			for (int i = front; i <= rear; i++)
				System.out.println(queue[i]);
		}
	}
	
	int search(int data) throws QueueEmptyException {

		if(isEmpty())
			throw new QueueEmptyException();
		else {
			for (int i = front; i <= rear; i++)
				if (queue[i] == data)
					return i;
			return -1;
		}
	}
	
}
