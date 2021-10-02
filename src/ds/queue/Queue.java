package queue;

	class Queue {
	
	int MAX;
	int front;
	int rear;
	int size;
	int Queue[];
	
	
	Queue(int max_value){
		
		MAX = max_value;
		front = -1;
		rear = -1;
		size=0;
		Queue = new int[MAX];
		
	}
	
	void enqueue(int data) {
		
		if(size==MAX)
			System.out.println("Queue Overflow");
		else 
		{
		Queue[++rear] = data;
		if(front==-1)
			front++;
		size++;
		}
	}
	
	void dequeue() {
		
		if(front>rear)
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
			return Queue[front];
	}
	
	boolean isEmpty() {
		
		if(front==-1 && rear==front || front>rear) 
			return true;
		else 
			return false;
		
	}
	
	void printqueue() {
		
		for(int i=front;i<=rear;i++)
			System.out.println(Queue[i]);
	}
	
	int search(int data) {
		
		for(int i=front;i<=rear;i++)
			if(Queue[i]==data)
				return i;
		return -1;
		
	}
	
}
