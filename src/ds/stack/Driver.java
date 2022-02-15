package ds.stack;

public class Driver {

	public static void main(String[] args){
		
		Stack stack = new Stack(100);
		
		//remove from empty stack
	/*	try {
			stack.pop();
		}
		catch(StackEmptyException e){
			e.callShow();
		}
	*/
		try {
			//push an element at the end of the stack
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
			stack.push(7);
		}
		catch(StackOverFlowException e){
			e.callShow();

		}
		//print the stack
		try {
			stack.printStack();
		}
		catch(StackEmptyException e){
			e.callShow();
		}

		//remove an element from the top of the stack
		try {
			stack.pop();
			stack.pop();
			stack.pop();
		}
		catch(StackEmptyException e)
		{
			e.callShow();
		}

		//check if the stack is empty, returns true if empty, else false
		System.out.println(stack.isEmpty());
		
		//returns the topmost element of the stack, if top is -1 return -1
		try {
			System.out.println(stack.peek());
		}
		catch(StackEmptyException e){
			e.callShow();
		}

		try {
			stack.printStack();
		}
		catch(StackEmptyException e){
			e.callShow();
		}

		//searches element and returns its index (0 indexing), else returns -1 
		System.out.println(stack.search(2));
		
		//stack overflow
		for(int i = stack.returnTop()+1;i<=stack.returnMax();i++) {
			try {
				stack.push(i);
			}
			catch(StackOverFlowException e)
			{
				e.callShow();
			}
		}
		try {
			stack.printStack();
		}
		catch(StackEmptyException e)
		{
			e.callShow();
		}
	}
	
}
