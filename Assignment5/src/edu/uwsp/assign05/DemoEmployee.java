/* This class demonstrates the employee class by creating objects in an arraylist and printing them.
 * Name: Megan Banaski
 * CNMT 110 sec 1 Assignment 5
 * 04/17/2018 11:10AM
 */

package edu.uwsp.assign05;

import java.util.ArrayList;

public class DemoEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		Employee one = new Employee("Bob Builder", 46, "101 Leaf Street");
		Employee two = new Employee("Stan Man", 58, "402 Burden Street");
		Employee three = new Employee("Person Person", 35, "106 Stanley Street");
		Employee four = new Employee("Mark Zuckerberg", 33, "503 NotALizard Avenue");
		Employee five = new Employee("Callie Lindemeyer", 20, "509 Lovely Lady Street");
		
		employees.add(one);
		employees.add(two);
		employees.add(three);
		employees.add(four);
		employees.add(five);
		
		for (int i = 0; i < employees.size(); i++) {
			Employee person = employees.get(i);
			System.out.println(person);
		}
		
	}

}
