package testQueue;

import static org.junit.Assert.*;
//import junit.framework.Assert;
//import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import ApplicationLevelMethods.Methods;

import queuePackage.LinkedUnbndQueue;

public class Test_AppLevel_showQueue {

	/* Tests of static method: showQueue
	 *   test for a null reference
	 *   test an empty queue
	 *   test queue with one element
	 *   test queue with many elements
	 */

	LinkedUnbndQueue<String> myQ;

	@Before
	public void setUp() throws Exception {
		myQ = new LinkedUnbndQueue<String>();
	}
	
	@Test
	public void test_null_reference() {
		
		assertEquals("", Methods.showQueue(myQ));
		
	}
	
	@Test
	public void test_empty_Queue() {
		
		assertEquals("", Methods.showQueue(myQ));
				
	}

	@Test
	public void test_queue_with_one_element() {
		
		myQ.enqueue("One");

		assertEquals("One ", Methods.showQueue(myQ));
		
	}

	@Test
	public void test_queue_with_many_elements() {
		
		myQ.enqueue("One"); myQ.enqueue("Two"); myQ.enqueue("Three");

		assertEquals("One Two Three ", Methods.showQueue(myQ));
	}
}
