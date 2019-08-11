//----------------------------------------------------------------------------
// UnboundedStackInterface.java       by Dale/Joyce/Weems            Chapter 3
//
// Interface for a class that implements a stack of <T> with no bound
// on the size of the stack. A stack is a last-in, first-out structure.
//----------------------------------------------------------------------------

package week4.ch3.stackwithoutgenerics;

public interface UnboundedStackInterface extends StackInterface

{
  void push(Object element);
  // Places element at the top of this stack.

}
