package tutorials;

import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String wageString; 
	String dependentsString;
	String hoursWorkedString;
	double wage, weeklyPay;
	int depedents;
	double HOURS_IN_WEEK;
	
	hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours did you work during the week? ", 
			JOptionPane.INFORMATION_MESSAGE);
	HOURS_IN_WEEK = Double.parseDouble(hoursWorkedString);
	
	wageString = JOptionPane.showInputDialog(null, "Enter empolyee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
	weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
	dependentsString = JOptionPane.showInputDialog(null, "How many depedents?", "Salary dialog 2 ", JOptionPane.QUESTION_MESSAGE);
	depedents = Integer.parseInt(dependentsString);
	JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for "  +  depedents + " depedents ");}
	
}
