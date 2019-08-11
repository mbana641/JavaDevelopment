package testStack;

import stackPackage.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * Class to test the clear method added to the Stack ADTs of Lab02
 * 
 *   test clearing an empty stack
 *        a stack with one element
 *        a stack with multiple elements
 *        and a "full" ArrayStack (not applicable to Linked Stack - comment it out)
 *     
 */

public class Test_clear {

	ArrayStack<Integer> stk1;

	@Before
	public void setUp() throws Exception {
		stk1 = new ArrayStack<Integer>(5);
	}
/*
	LinkedStack<Integer> stk1;
	@Before
	public void setUp() throws Exception {
	stk1 = new LinkedStack<Integer>();
	}
*/
	@Test
	public void test_clear_on_an_emptyStack() {
		stk1.clear();

	    Assert.assertEquals(true, stk1.isEmpty());
	}
	@Test
	public void test_clear_on_a_stack_with_1_element() {
		stk1.push(5);
		
		stk1.clear();

	    Assert.assertEquals(true, stk1.isEmpty());
	}

	@Test
	public void test_clear_on_a_stack_with_multiple_elements() {
		stk1.push(5); stk1.push(4); stk1.push(3);
		
		stk1.clear();

	    Assert.assertEquals(true, stk1.isEmpty());
	}

	// do you need to comment this out when testing a LinkedStack?
	// why or why not?
	// No, because either way it would clear the stack
	@Test
	public void test_clear_on_a_full_stack() {
		stk1.push(1); stk1.push(2); stk1.push(3); stk1.push(4); stk1.push(5);
		
		stk1.clear();

	    Assert.assertEquals(true, stk1.isEmpty());
	}

	@After
	public void tearDown() throws Exception {

	}

}
