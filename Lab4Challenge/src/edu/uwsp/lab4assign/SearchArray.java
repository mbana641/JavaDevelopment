/* This class creates an array of numbers, prints it, sorts it, and prints it again.
 * Name: Megan Banaski
 * CNMT 110 Sec 1
 * 04/16/2018 10:32 AM
 */

package edu.uwsp.lab4assign;

import java.util.Arrays;

public class SearchArray {

	public static void main(String[] args) {
		int[] numbers = { 20, 34, 56, 10, 2, 90, 22, 11, 70, 67 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22) {
				System.out.println(i);
			}
		}
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println(" ");
		Arrays.sort(numbers);

		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
	
}
