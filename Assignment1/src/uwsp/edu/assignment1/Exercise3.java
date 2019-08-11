package uwsp.edu.assignment1;

import javax.swing.JOptionPane;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		String num1;
		String num2;
		String num3;
		
		num1 = JOptionPane.showInputDialog("What is your first number?");
		num2 = JOptionPane.showInputDialog("What is your second number?");
		num3 = JOptionPane.showInputDialog("What is your third number?");
		
		int num4;
		num4 = Integer.parseInt(num1);
		
		int num5;
		num5 = Integer.parseInt(num2);
		
		int num6;
		num6 = Integer.parseInt(num3);
		
		JOptionPane.showMessageDialog(null, ((num4 + num5 + num6)/3));
		
	}
}
