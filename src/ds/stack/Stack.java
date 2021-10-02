package stack;

class Stack {

	int MAX;
	int Stack[];
	int top;
	
	Stack(int max_value){
		
		MAX = max_value;
		Stack = new int[MAX];
		top =-1;
	}
	
	void push(int data) {
		
		if(top==MAX-1)
			System.out.println("Stack Overflow");
		else
			Stack[++top] = data;
		
	}
	
	void pop() {
		
		if(top==-1)
			System.out.println("No element to remove");
		else
			top--;
	}
	
	int search(int data) {
		
		for(int i=0;i<=top;i++)
			if(Stack[i]==data)
				return i;
		
		return -1;
	}
	
	int peek() {
		
		return Stack[top];
		
	}
	
	boolean isEmpty() {
		
		if(top ==-1)
			return true;
		else 
			return false;
	}
	
	void printstack() {
		
		for(int i=0;i<=top;i++)
			System.out.println(Stack[i]);
	}
	
}
