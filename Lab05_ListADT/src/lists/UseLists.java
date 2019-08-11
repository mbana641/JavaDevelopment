package lists;

public class UseLists
{
   public static void main(String[] args)
   {
      ArrayUnsortedList<String> list1 = new ArrayUnsortedList<String>(3);
      list1.add("Wirth");
      list1.add("Dykstra");
      list1.add("DePasquale");
      list1.add("Dahl");
      list1.add("Nygaard");
      list1.remove("DePasquale");
      
      ArrayUnsortedList<String> list2 = new ArrayUnsortedList<String>(3);
      list2.add("Wirth");
      list2.add("Dykstra");
      list2.add("Nygaard");
      list2.add("Person");
      list2.add("Nygaard");
      
      ArrayUnsortedList<String> list3 = new ArrayUnsortedList<String>(3);
/*
      ListInterface<String> list2 = new ArraySortedList<String>(3);
      list2.add("Wirth");
      list2.add("Dykstra");
      list2.add("DePasquale");
      list2.add("Dahl");
      list2.add("Nygaard");
      list2.remove("DePasquale");

      IndexedListInterface<String> list3 = new ArrayIndexedList<String>(3);
      list3.add(0, "Wirth");
      list3.add(0, "Dykstra");
      list3.add(0, "DePasquale");
      list3.add(3, "Dahl");
      list3.add(2, "Nygaard");
      list3.remove("DePasquale");

      System.out.print("Unsorted ");
      System.out.println(list1);
      System.out.print("Sorted ");
      System.out.println(list2);
      System.out.print("Indexed ");
      System.out.println(list3);
*/
      System.out.print("Unsorted ");
      System.out.println(list1);
      System.out.println(compareLists(list1, list2));
      System.out.println(list3);
      System.out.println(list3.isEmpty());
      System.out.println(list2.isEmpty());
      System.out.println(list2);
      System.out.println(list2.removeAll("Nygaard"));
      System.out.println(list2);
   }
   
   public static int compareLists(ArrayUnsortedList<String> list1, ArrayUnsortedList<String> list2) {
	 //use equals, reset, getNext method
	   int one = 0;
	   int count = 0;
	   int lcount = 0;
	   String el;
	   while (one < list1.size()) {
		   el = list1.getNext();
		   lcount = 0;
		   while (list2.contains(el)) {
			   list2.remove(el);
			   lcount++;
			   count++;
		   }
		   int n = 0;
		   while (n < lcount) {
			   list2.add(el);
			   n++;
		   }
		   list2.reset();
		   one++;
	   }
	   return count;
	   
   }
}