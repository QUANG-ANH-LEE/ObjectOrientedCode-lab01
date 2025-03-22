package lab01;

import javax.swing.JOptionPane;

//Example 4: ShowTwoNumbers.java
public class CalculateTwoNumber {
	public static void main(String[] args) {
	String strNum1, strNum2;
	
	strNum1 = JOptionPane.showInputDialog(null,
			"Please input the first number: ","Input the first number",
			JOptionPane.INFORMATION_MESSAGE);
	double num1 = Double.parseDouble(strNum1);

	
	strNum2 = JOptionPane.showInputDialog(null,
			"Please input the second number: ","Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
	double num2 = Double.parseDouble(strNum2);

	
	JOptionPane.showMessageDialog(null, "The sum of two number is: " 
			+ (num1+num2),
			"show two numbers", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "The difference of two number is: " 
			+ (num1-num2),
			"show two numbers", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "The product of two number is: " 
			+ (num1*num2),
			"show two numbers", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "The quotient of two number is: " 
			+ (num1/num2),
			"show two numbers", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}
}
