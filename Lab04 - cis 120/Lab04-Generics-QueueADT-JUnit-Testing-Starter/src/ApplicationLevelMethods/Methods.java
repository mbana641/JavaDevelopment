package ApplicationLevelMethods;


import edu.uwsp.lab01.LLStringNode;
import queuePackage.LLNode;
import queuePackage.LinkedUnbndQueue;

public class Methods {
	
	public static void main(String[] args) {
		LinkedUnbndQueue<String> origQ = new LinkedUnbndQueue<String>();
		
		origQ.enqueue("One");
		origQ.enqueue("Two");
		origQ.enqueue("Three");
		origQ.enqueue("Four");
		origQ.enqueue("Five");
		origQ.enqueue("Six");
		origQ.enqueue("Seven");
		origQ.enqueue("Eight");
		origQ.enqueue("Nine");
		origQ.enqueue("Ten");
		
		System.out.println(showQueue(origQ));
		LinkedUnbndQueue<String> newQueue;
		newQueue = copyQueue(origQ);
		System.out.println(showQueue(origQ));
		System.out.println(showQueue(newQueue));
		
		System.out.println(count(origQ));
	}

	// make a copy of orig queue, leaving it unchanged
	public static LinkedUnbndQueue<String> copyQueue(LinkedUnbndQueue<String> origQ) {
		int count = 0;
	    LLNode<String> node;
	    node = origQ.getFront();
	    while (node != null)
	    {
	      count++;
	      node = node.getLink();
	    }
	    LinkedUnbndQueue<String> newQueue = new LinkedUnbndQueue<String>();
	    String hold;
		for (int p = 0; p < count; p++) {
			hold = origQ.dequeue();
			origQ.enqueue(hold);
			newQueue.enqueue(hold);
		}
		return newQueue;
		
	}

	// return a count of the number of elements of the orig queue, leaving it unchanged
	public static int count(LinkedUnbndQueue<String> origQ) {

		int count = 0;
	    LLNode<String> node;
	    node = origQ.getFront();
	    while (node != null)
	    {
	      count++;
	      node = node.getLink();
	    }
	    return count;
		
	}

	// return a nicely formatted string representing the queue, leaving it unchanged
	public static String showQueue(LinkedUnbndQueue<String> origQ) {

		String string = "";
	    LLNode<String> node;
	    node = origQ.getFront();
	    
	    while (node != null)
	    {
	      string = string + node.getInfo() + " ";
	      node = node.getLink();
	    }
	      
	    return string;

	}

}
