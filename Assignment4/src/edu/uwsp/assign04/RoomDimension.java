/*This class initializes length and width and create a method to calculate the area.
 * Megan Banaski
 * CNMT 110 Sec 1 
 * Date: 04/05/2018 2:19 PM
 */
package edu.uwsp.assign04;

public class RoomDimension {
	
	private double length, width;
	
	public RoomDimension (double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length*width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		
		str = str.append("Length is: ").append(length).append("\n").append("Width is: ").append(width).append("\n").append("Area is: ").append(getArea());
		return str.toString();
	}
}
