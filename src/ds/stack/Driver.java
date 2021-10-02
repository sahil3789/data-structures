package stack;

public class Driver {

	public static void main(String args[]) {
		
		
		Stack stack = new Stack(100);
		
		
		//push an element at the end of the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		//print the stack
		stack.printstack();
		
		//remove an element from the top of the stack
		stack.pop();
		stack.pop();
		stack.pop();

		//check if the stack is empty, returns true if empty, else false
		System.out.println(stack.isEmpty());
		
		//returns the topmost element of the stack
		System.out.println(stack.peek());
		
		stack.printstack();
		
		//searches element and returns its index (0 indexing), else returns -1 
		System.out.println(stack.search(2));
	}
	
}
