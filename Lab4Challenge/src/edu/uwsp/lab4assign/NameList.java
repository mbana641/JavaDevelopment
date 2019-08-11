/* This class creates an ArrayList of names, set, adds, and removes names, and prints names
 * Name: Megan Banaski
 * CNMT 110 Sec 1
 * 04/16/2018 10:25AM
 */

package edu.uwsp.lab4assign;

import java.util.ArrayList;

public class NameList {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();//creates ArrayList

		nameList.add("John Walter");
		nameList.add("Harry Potter");
		nameList.add("John Morey");
		nameList.add("Scott Thapa");
		nameList.add("James Bond");
		nameList.add("Garret Krause");//all names added

		nameList.set(2, "Ben Morey");//changes third name from John to Ben
		System.out.println("The third name in the list has been" + " changed from John to Ben: " + nameList);

		nameList.add("Chris Pratt");//adds a name
		System.out.println("A name has been added to the list: " + nameList);

		System.out.println("The length of the list is: " + nameList.size());//prints the length of the list

		for (String name : nameList) {
			System.out.println(name);
		}//for loop to print all names

		nameList.remove(3);//removes the fourth name in the list
		System.out.println(nameList.size());//prints the length of the list

		nameList.set(1, "Harry");//changes name to just Harry
		nameList.add(2, "Potter");//adds Potter directly after

		for (String name : nameList) {
			System.out.println(name);
		}//for loop to print all names
	}

}
