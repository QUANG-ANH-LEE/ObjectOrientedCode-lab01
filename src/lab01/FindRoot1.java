package lab01;
//Find root of ax + b = 0
import javax.swing.JOptionPane;

public class FindRoot1 {
	public static void main(String[] args) {
		String strNum1, strNum2;
		double num1, num2;
		do {
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first coefficient: ","Input the first coefficient",
				JOptionPane.INFORMATION_MESSAGE);
		num1 = Double.parseDouble(strNum1);

		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second coefficient: ","Input the second coefficient",
				JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		}while(num1==0||num2==0);
		
		JOptionPane.showMessageDialog(null, "Root of the equal is: " 
				+ ((-num2)/num1),
				"Result", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		}
	}