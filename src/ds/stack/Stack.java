package ds.stack;

class Stack {

	private int max;
	private int stack[];
	private int top;
	
	Stack(int maxValue){
		
		if(max<=0)
			System.out.println("can't take negative value");
		else {
		max = maxValue;
		stack = new int[max];
		top =-1;
		}
	}
	
	int returnTop() {
		return top;
	}
	
	int returnMax() {
		return max;
	}
	
	void push(int data) {
		
		if(top==max-1)
			System.out.println("Stack Overflow");
		else
			stack[++top] = data;
		
	}
	
	void pop() {
		
		if(top==-1)
			System.out.println("No element to remove");
		else
			top--;
	}
	
	int search(int data) {
		
		for(int i=0;i<=top;i++)
			if(stack[i]==data)
				return i;
		
		return -1;
	}
	
	int peek() {
		
		if(top==-1)
			return -1;
		else
		return stack[top];
		
	}
	
	boolean isEmpty() {
		
		if(top ==-1)
			return true;
		else 
			return false;
	}
	
	void printStack() {
		
		for(int i=0;i<=top;i++)
			System.out.println(stack[i]);
	}
	
}
