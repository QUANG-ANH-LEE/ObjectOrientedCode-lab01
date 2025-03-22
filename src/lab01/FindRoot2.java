package lab01;

import javax.swing.JOptionPane;

//Example 4: ShowTwoNumbers.java
public class FindRoot2 {
	public static void main(String[] args) {
	String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
	
	strNum1 = JOptionPane.showInputDialog(null,
			"Please input the 1st coefficient: ","Input the 1st equation",
			JOptionPane.INFORMATION_MESSAGE);
	double num1 = Double.parseDouble(strNum1);

	
	strNum2 = JOptionPane.showInputDialog(null,
			"Please input the 2nd coeffecient: ","Input the 1st equation",
			JOptionPane.INFORMATION_MESSAGE);
	double num2 = Double.parseDouble(strNum2);
	
	strNum3 = JOptionPane.showInputDialog(null,
			"Please input the 3th coeffecient: ","Input the 1st equation",
			JOptionPane.INFORMATION_MESSAGE);
	double num3 = Double.parseDouble(strNum3);
	
	strNum4 = JOptionPane.showInputDialog(null,
			"Please input the 1st coeffecient: ","Input the 2nd equation",
			JOptionPane.INFORMATION_MESSAGE);
	double num4 = Double.parseDouble(strNum4);

	
	strNum5 = JOptionPane.showInputDialog(null,
			"Please input the 2nd coeffecient: ","Input the 2nd equation",
			JOptionPane.INFORMATION_MESSAGE);
	double num5 = Double.parseDouble(strNum5);
	
	strNum6 = JOptionPane.showInputDialog(null,
			"Please input the 3th coeffecient: ","Input the 2nd equation",
			JOptionPane.INFORMATION_MESSAGE);
	double num6 = Double.parseDouble(strNum6);

	double det = (num1*num5) - (num2*num4);
	if(det==0){
		System.out.println("The system has many solutions or no solution");
	}
	else {
		double d1 = (num3*num5)-(num6*num2);
		double d2 = (num1*num6)-(num4*num3);
		
		JOptionPane.showMessageDialog(null, "x = " 
			+ (d1/det) + "\ny= " + (d2/det),
			"The root of the system", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
	}
}
