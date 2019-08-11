/*This assignment uses getters and setters and constructors to print information about cars
 * Megan Banaski
 * CNMT 110 Sec 1
 * Assignment 2
 * 2/20/18 19:38:00
 */
package edu.uwsp.assign02;

public class DemoCar {

	public static void main(String[] args) {

		Car obj = new Car();
		System.out.println("The color is " + obj.getColor() + " and the model is " + obj.getModelName()
				+ " and the year model " + obj.getYearModel());

		Car obj2 = new Car();
		obj2.setColor("Black");
		obj2.setModelName("Sonata");
		obj2.setYearModel(1985);
		System.out.println("The color is " + obj2.getColor() + " and the model is " + obj2.getModelName()
				+ " and the year model " + obj2.getYearModel());

		Car obj3 = new Car();
		obj3.setColor("White");
		obj3.setModelName("Accent");
		obj3.setYearModel(2000);
		System.out.println("The color is " + obj3.getColor() + " and the model is " + obj3.getModelName()
				+ " and the year model " + obj3.getYearModel());

	}

}
