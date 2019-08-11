package week4.ch3.stackwithoutgenerics;

/**
 * @author hdhalla
 * 
 */
public class ArrayStack implements BoundedStackInterface {

	protected Object[] stack;
	protected int topIndex = -1;

	public ArrayStack() {
		stack = new Object[100];
	}

	public ArrayStack(int capacity) {
		stack = new Object[capacity];
	}

	public void push(Object element) {
		if (!isFull()) {
			topIndex++;
			stack[topIndex] = element;
		} else {
			throw new StackOverflowException("Stack is full...");
		}
	}

	public void pop() {

		if (!isEmpty()) {
			stack[topIndex] = null;
			topIndex--;
		} else {
			throw new StackUnderflowException("Stack is empty...");
		}

	}

	public Object peek() {

		Object topElement;

		if (!isEmpty()) {
			topElement = stack[topIndex];
		} else {
			throw new StackUnderflowException("Stack is empty...");
		}
		return topElement;
	}

	public boolean isEmpty() {
		if (topIndex == -1)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (topIndex == stack.length - 1)
			return true;
		else
			return false;
	}
	
	public static void main(String... args)
	{
		ArrayStack collection = new ArrayStack(4);
		collection.push(new String("Hello1"));
		collection.push(new String("Hello2"));
		collection.push(new String("Hello3"));
		collection.push(new Integer(12));
		System.out.println(collection.isFull());
		System.out.println(collection.peek());
		String el = (String) collection.peek();
		System.out.println(collection.peek());
	}

}
