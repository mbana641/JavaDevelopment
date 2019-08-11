package lists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveAllTest {

	ArrayUnsortedList<String> list1 = new ArrayUnsortedList<String>();
	@Test
	void testEmptyList() {
		
		assertEquals(0, list1.removeAll("A"));
	}
	
	@Test
	void testOneElementList() {
		list1.add("A");
		
		assertEquals(1, list1.removeAll("A"));
	}
	
	@Test
	void testMultipleElementList() {
		list1.add("A"); list1.add("B"); list1.add("A"); list1.add("A"); list1.add("C");
		
		assertEquals(3, list1.removeAll("A"));
	}

}
