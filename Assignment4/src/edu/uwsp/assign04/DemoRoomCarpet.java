/*This program demonstrates the RoomDimension and RoomCarpet classes to show the total cost of the carpet.
 * Megan Banaski
 * CNMT 110 Sec 1 
 * Date: 04/05/2018 2:19 PM
 */
package edu.uwsp.assign04;

public class DemoRoomCarpet {

	public static void main(String[] args) {
		RoomDimension roomDimension = new RoomDimension(12, 14);
		
		RoomCarpet totalArea = new RoomCarpet(roomDimension, 1.5);
		
		System.out.println(totalArea.getTotalCost());
	}

}
