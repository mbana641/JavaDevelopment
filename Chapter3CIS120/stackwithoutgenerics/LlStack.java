package week4.ch3.stackwithoutgenerics;

import java.util.LinkedList;

public class LlStack {

	private LinkedList<String> stack;

	public LlStack() {
		stack = new LinkedList<String>();
	}

	public void push(String element) {
		stack.add(element);
	}

	public String pop() {
		return stack.pop();
	}

	public String peek() {
		return stack.peek();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public static void main(String[] args) {
      // to-do
	}

}
