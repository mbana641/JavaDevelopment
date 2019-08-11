//----------------------------------------------------------------------
// LinkedStack.java         by Dale/Joyce/Weems                Chapter 3
//
// Implements UnboundedStackInterface using a linked list 
// to hold the stack elements.
//-----------------------------------------------------------------------

package stackPackage;

import java.util.Stack;

public class LinkedStack<T> implements UnboundedStackInterface<T> {
	protected LLNode<T> top; // reference to the top of this stack

	public LinkedStack() {
		top = null;
	}

	public void push(T element)
	// Places element at the top of this stack.
	{
		LLNode<T> newNode = new LLNode<T>(element);
		newNode.setLink(top);
		top = newNode;
	}

	public void pop()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise removes top element from this stack.
	{
		if (!isEmpty()) {
			top = top.getLink();
		} else
			throw new StackUnderflowException("Pop attempted on an empty stack.");
	}

	public T top()
	// Throws StackUnderflowException if this stack is empty,
	// otherwise returns top element from this stack.
	{
		if (!isEmpty())
			return top.getInfo();
		else
			throw new StackUnderflowException("Top attempted on an empty stack.");
	}

	public boolean isEmpty()
	// Returns true if this stack is empty, otherwise returns false.
	{
		if (top == null)
			return true;
		else
			return false;
	}
	
	public int sizeIs()
	{
		int count = 0;
		for (LLNode<T> node = top; node != null; node = node.getLink()) {
			count++;
		}
		return count;
	}
	
	public void clear()
	{
		top = null;		
	}
	
	public String toString()
	{
		String stackString = "";
		if (top == null) {
			stackString = "Empty Stack";
		} else {
		LLNode<T> node = top;
		while (node != null) {
			stackString = node.getInfo() + "|" + stackString;
			node = node.getLink();
		}
		stackString = "bottom|" + stackString + "top";
		}
		return stackString;
	}
}
