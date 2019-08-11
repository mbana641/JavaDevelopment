/*
 * Name: Megan Banaski
 * This exercise prints all even numbers from 1-100
 * CNMT 110 Week 7 In Class Exercises
 * Date: 03/09/2018 8:55AM
 */
package edu.uwsp.learning;

public class EvenNumbersLoop {

	public static void main(String[] args) {
		
		for (int number = 1; number <= 100; number++) {
			if (number%2 == 0) {
				System.out.println(number);
			}
		}

	}

}
