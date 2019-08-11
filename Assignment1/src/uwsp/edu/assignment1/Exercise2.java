package uwsp.edu.assignment1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		double area;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the area of your property in square feet?");
		area = keyboard.nextDouble();
		
		System.out.println("The area of your property in acres is " + (area / 43560));
		
	}
}
