package lists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isEmptyTest {
	
	ArrayUnsortedList<String> list1 = new ArrayUnsortedList<String>();

	@Test
	void EmptyListTest() {
		
		assertEquals(true, list1.isEmpty());
	}
	
	@Test
	void OneElementTest() {
		list1.add("A");
		
		assertEquals(false, list1.isEmpty());
	}
	
	@Test
	void MultipleElementsTest() {
		list1.add("A"); list1.add("B"); list1.add("C");
		
		assertEquals(false, list1.isEmpty());
	}

}
