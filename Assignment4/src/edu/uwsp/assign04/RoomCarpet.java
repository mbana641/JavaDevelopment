/*This class initializes carpetCost and creates a method to calculate the total cost of putting in the carpet.
 * Megan Banaski
 * CNMT 110 Sec 1 
 * Date: 04/05/2018 2:19 PM
 */
package edu.uwsp.assign04;

public class RoomCarpet {
	private RoomDimension roomDimension;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension roomDimension, double carpetCost) {
		this.roomDimension = roomDimension;
		this.carpetCost = carpetCost;
	}
	public double getTotalCost() {
		return roomDimension.getArea() * carpetCost;
	}

	public void setRoomDimension(RoomDimension roomDimension) {
		this.roomDimension = roomDimension;
	}

	public double getCarpetCost() {
		return carpetCost;
	}

	public void setCarpetCost(double carpetCost) {
		this.carpetCost = carpetCost;
	}
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		
		str = str.append("Room Dimensions: ").append(roomDimension).append("\n").append("Carpet Cost (per square foot): ").append(carpetCost);
		return str.toString();
	}
}
