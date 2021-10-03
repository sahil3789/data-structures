package ds.stack;

class Stack {

	private int max;
	private int stack[];
	private int top;
	
	Stack(int maxValue){
		
		try {
		max = maxValue;
		top =-1;
		stack = new int[max];
		}
		catch(NegativeArraySizeException e) {
			System.out.println("stack size can't be a negative number");
			System.out.println("stack of size 100 created");
			max = 100;
			stack = new int[100];
		}
		
	}
	
	int returnTop() {
		return top;
	}
	
	int returnMax() {
		return max;
	}
	
	void push(int data) {
		
			try {
			stack[++top] = data;
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack Overflow");
			top--;
		}
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
