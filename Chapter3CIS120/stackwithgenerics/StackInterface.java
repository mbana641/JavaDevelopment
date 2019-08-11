//----------------------------------------------------------------------------
// StackInterface.java           by Dale/Joyce/Weems                 Chapter 3
//
// Interface for a class that implements a stack of <T>.
// A stack is a last-in, first-out structure.
//----------------------------------------------------------------------------

package week4.ch3.stackwithgenerics;

public interface StackInterface<T>

{
  void pop() throws StackUnderflowException;
  // Throws StackUnderflowException if this stack is empty,
  // otherwise removes top element from this stack.
  
  T peek() throws StackUnderflowException;
  // Throws StackUnderflowException if this stack is empty,
  // otherwise returns top element from this stack.
  
  boolean isEmpty();
  // Returns true if this stack is empty, otherwise returns false.

}
