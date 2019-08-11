/* This class creates Employee which stores the name, age, and address of an employee, it also creates a string that will be printed in the demo class.
 * Name: Megan Banaski
 * CNMT 110 Sec 1 Assignment 5
 * 04/17/2018 11:10AM
 */

package edu.uwsp.assign05;

public class Employee {
	private String name, address;
	private int age;
	
	public Employee() {	
	}
	public Employee(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
public String toString() {
		
		StringBuilder str = new StringBuilder();
		
		str = str.append("Employee name is: ").append(name).append("\n").append("Employee age is: ").append(age).append("\n").append("Employee address is: ").append(address);
		return str.toString();
	}
}
