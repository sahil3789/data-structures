package ds.queue;

	class Queue {
	
	int max;
	int front;
	int rear;
	int size;
	int queue[];
	
	
	Queue(int maxValue){
		
		max = maxValue;
		front = -1;
		rear = -1;
		size=0;
		queue = new int[max];
		
	}
	
	void enqueue(int data) {
		
		if(size==max)
			System.out.println("Queue Overflow");
		else 
		{
		queue[++rear] = data;
		if(front==-1)
			front++;
		size++;
		}
	}
	
	void dequeue() {
		
		if(front>rear || front ==-1 && rear==front)
			System.out.println("Queue is empty");
		else {
			front++;
			size--;
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
