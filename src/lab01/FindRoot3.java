package lab01;

import javax.swing.JOptionPane;

public class FindRoot3 {
	public static void main(String[] args) {
		String strNum1, strNum2, strNum3;
		double num1, num2, num3;
		do {
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first coefficient: ","Input the first coefficient",
				JOptionPane.INFORMATION_MESSAGE);
		num1 = Double.parseDouble(strNum1);

		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second coefficient: ","Input the second coefficient",
				JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		
		strNum3 = JOptionPane.showInputDialog(null,
				"Please input the second coefficient: ","Input the second coefficient",
				JOptionPane.INFORMATION_MESSAGE);
		num3 = Double.parseDouble(strNum3);
		}while(num1 == 0);
		double delta = num2*num2 - 4*num1*num3;
		if(delta<0) {
			JOptionPane.showMessageDialog(null, "the equation is unsolved!" ,
					"Result", JOptionPane.INFORMATION_MESSAGE);
		}else {
			if(delta == 0) {
				JOptionPane.showMessageDialog(null, "Root of the equal is: " 
						+ ((-num2)/(2*num1)),
						"Result", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "x1 = " 
							+ (((-num2)-Math.sqrt(delta))/(2*num1))
							+ "\nx2 = " + (((-num2)+Math.sqrt(delta))/(2*num1)),
							"Result", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		System.exit(0);
		}
	}
