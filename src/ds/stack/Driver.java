package ds.stack;

public class Driver {

	public static void main(String args[]) {
		
		
		Stack stackobj = new Stack(100);
		
		//remove from empty stack
		stackobj.pop();
		
		//push an element at the end of the stack
		stackobj.push(1);
		stackobj.push(2);
		stackobj.push(3);
		stackobj.push(4);
		stackobj.push(5);
		stackobj.push(6);
		stackobj.push(7);
		
		//print the stack
		stackobj.printStack();
		
		//remove an element from the top of the stack
		stackobj.pop();
		stackobj.pop();
		stackobj.pop();

		//check if the stack is empty, returns true if empty, else false
		System.out.println(stackobj.isEmpty());
		
		//returns the topmost element of the stack, if top is -1 return -1
		System.out.println(stackobj.peek());
		
		stackobj.printStack();
		
		//searches element and returns its index (0 indexing), else returns -1 
		System.out.println(stackobj.search(2));
		
		//stack overflow
		for(int i = stackobj.returnTop()+1;i<=stackobj.returnMax();i++)
			stackobj.push(i);
	}
	
}
