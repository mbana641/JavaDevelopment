package testQueue;

import static org.junit.Assert.*;
//import junit.framework.Assert;
//import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import ApplicationLevelMethods.Methods;

import queuePackage.LinkedUnbndQueue;

/* Tests of static method: copyQueue
 *   test for a null reference; the copy should also be a null reference
 *   test an empty queue
 *   test queue with one element
 *   test queue with many elements
 */

public class Test_AppLevel_copyQueue {

	LinkedUnbndQueue<String> q1, q2;

	@Before
	public void setUp() throws Exception {	
		
		q1 = new LinkedUnbndQueue<String>();
		// q2 is set in each test below
		
	}

	@Test
	public void test_null_reference() {
		q2 = new LinkedUnbndQueue<String>();
		q2 = Methods.copyQueue(q1);

		assertEquals(Methods.showQueue(q1), Methods.showQueue(q2));
	}

	@Test
	public void test_empty_Queue() {

		q2 = new LinkedUnbndQueue<String>();
		q2 = Methods.copyQueue(q1);

		assertEquals(Methods.showQueue(q1), Methods.showQueue(q2));	
	}
	
	@Test
	public void test_queue_with_one_element() {
		
		q1.enqueue("One");

		q2 = new LinkedUnbndQueue<String>();
		q2 = Methods.copyQueue(q1);

		assertEquals(Methods.showQueue(q1), Methods.showQueue(q2));
		
	}	

	@Test
	public void test_queue_with_many_elements() {
		
		q1.enqueue("One"); q1.enqueue("Two"); q1.enqueue("Three");
			
		q2 = new LinkedUnbndQueue<String>();
		q2 = Methods.copyQueue(q1);

		assertEquals(Methods.showQueue(q1), Methods.showQueue(q2));
		
	}

}
