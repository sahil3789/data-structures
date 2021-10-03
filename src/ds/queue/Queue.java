package ds.queue;

	class Queue {
	
	int max;
	int front;
	int rear;
	int queue[];
	
	Queue(int maxValue){
		
		try {
		max = maxValue;
		front = -1;
		rear = -1;
		queue = new int[max];
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Queue size cant be negative");
			System.out.println("Created queue with size 100");
			max=100;
			queue = new int[100];
			
		}
	}
	
	void enqueue(int data) {
		
		try {
		queue[++rear] = data;
		if(front==-1)
			front++;
		}
		catch(IndexOutOfBoundsException e) {
			
			System.out.println("Queue is full");
			rear--;
		}
	}
	
	void dequeue() {
		
		if(front>rear || front ==-1 && rear==front)
			System.out.println("Queue is empty");
		else {
			front++;
			}
	}
	
	int peek() {
		
		if(front>rear)
			return -1;
		else
			return queue[front];
	}
	
	boolean isEmpty() {
		
		if(front==-1 && rear==front || front>rear) 
			return true;
		else 
			return false;
		
	}
	
	void printQueue() {
		
		for(int i=front;i<=rear;i++)
			System.out.println(queue[i]);
	}
	
	int search(int data) {
		
		for(int i=front;i<=rear;i++)
			if(queue[i]==data)
				return i;
		return -1;
		
	}
	
}
