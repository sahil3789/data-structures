package ds.stack;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

class StackOverFlowException extends Exception
{
	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	void callShow(){
		LOGGER.log(Level.WARNING, "Stack Overflow");
	}

}

class StackEmptyException extends  Exception {

	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	void callShow(){

		LOGGER.log(Level.WARNING, "Stack Empty");

	}
}


class Stack {

	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	static int max=100;
	private int[] stack;
	private int top;
	
	Stack(int maxValue){
		
		try {
		top =-1;
		stack = new int[maxValue];
		max=maxValue;
		}
		catch(NegativeArraySizeException e) {

			LOGGER.log(Level.WARNING, "stack size can't be a negative number");
			LOGGER.log(Level.INFO, "stack of size 100 created");

			stack = new int[max];
		}
		
	}
	
	int returnTop() {
		return top;
	}
	
	int returnMax() {
		return max;
	}
	
	void push(int data) throws StackOverFlowException {

			if(top==max-1)
				throw new StackOverFlowException();
			else {
				stack[++top] = data;
			}
	}
	
	void pop() throws  StackEmptyException{
		
		if(top==-1)
			throw new StackEmptyException();
		else
			top--;
	}
	
	int search(int data) {
		
		for(int i=0;i<=top;i++)
			if(stack[i]==data)
				return i;
		
		return -1;
	}
	
	int peek() throws StackEmptyException{
		
		if(top==-1)
			throw new StackEmptyException();
		else
		return stack[top];
		
	}
	
	boolean isEmpty() {

		return top ==-1;
	}
	
	void printStack() throws StackEmptyException{

		if(top==-1)
			throw new StackEmptyException();
		else
		for(int i=0;i<=top;i++)
			System.out.println(stack[i]);
		
	}
	
}

