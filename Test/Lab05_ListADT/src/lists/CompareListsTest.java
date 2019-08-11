package lists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareListsTest {
	
	ArrayUnsortedList<String> list1 = new ArrayUnsortedList<String>();
	ArrayUnsortedList<String> list2 = new ArrayUnsortedList<String>();

	@Test
	void testOnEmptyLists() {
		assertEquals(0, UseLists.compareLists(list1, list2));
	}
	
	@Test
	void testOneElementSameLists() {
		list1.add("A");
		list2.add("A");
		assertEquals(1, UseLists.compareLists(list1, list2));
	}
	
	@Test
	void testOneElementDifferentLists() {
		list1.add("B");
		list2.add("C");
		assertEquals(0, UseLists.compareLists(list1, list2));
	}
	
	@Test
	void testOnMultipleElementLists() {
		list1.add("A");list1.add("B");list1.add("C");list1.add("D");
		list2.add("A");list2.add("C");list2.add("D");list2.add("E");
		assertEquals(3, UseLists.compareLists(list1, list2));
	}
	
	@Test
	void testOnMultipleElementMultipleOccurencesLists() {
		list1.add("A");list1.add("B");list1.add("C");list1.add("D");
		list2.add("A");list2.add("C");list2.add("D");list2.add("E");list2.add("A");list2.add("C");list2.add("C");
		assertEquals(6, UseLists.compareLists(list1, list2));
	}

}
