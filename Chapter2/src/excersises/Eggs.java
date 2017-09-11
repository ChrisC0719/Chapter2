package excersises;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double costPerEgg = 0.45;
		final double costPerDozen = 3.25;
		
		int eggsOrders = Integer.parseInt(JOptionPane.showInputDialog("Eggs order")); 
		int dozenEggsOrder = (int) 3.25 ;
		int singleEggsOrder = (int) 0.45;
		double totalCost = (dozenEggsOrder * costPerDozen) + (singleEggsOrder * costPerEgg);
		JOptionPane.showMessageDialog(null,"You order eggs " + eggsOrders +"  " + dozenEggsOrder + " and " + singleEggsOrder + "  for a total of " + totalCost + ".");
		
		
		
		
		
	}

}
