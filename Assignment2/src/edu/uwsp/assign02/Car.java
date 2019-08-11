/*This assignment uses getters and setters and constructors to print information about cars
 * Megan Banaski
 * CNMT 110 Sec 1
 * Assignment 2
 * 2/20/18 19:38:00
 */

package edu.uwsp.assign02;

public class Car {

	private String color;
	private int yearModel;
	private String modelName;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Car() {
		color = "Red";
		modelName = "Elantra";
		yearModel = 1990;
	}

	public Car(String color, int yearModel, String modelName) {
		this.color = color;
		this.yearModel = yearModel;
		this.modelName = modelName;
	}

}
