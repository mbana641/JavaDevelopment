/*
 * This assignment creates a programs to give a discount when a certain number of items are purchased.
 * Name: Megan Banaski
 * CNMT 110 Sec1 
 * Date: 03/07/2018 
 */

package edu.uwsp.assign03;

import java.util.Scanner;//imports scanner

public class SoftwareSales {
	public static void calculatePurchaseCost() {

		final int sale = 99;// sets item cost
		int quantity;// taken from user

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What was the quantity purchased?");// takes input from user
		quantity = keyboard.nextInt();// stores input

		int total = sale * quantity;// calculates total

		if (total >= 10 && total <= 19) {// if-else-if applies discount
			System.out.println(total * 0.8);
		} else if (total >= 20 && total <= 49) {
			System.out.println(total * 0.7);
		} else if (total >= 50) {
			System.out.println(total * 0.6);
		} else {
			System.out.println(total);
		}
	}
}

