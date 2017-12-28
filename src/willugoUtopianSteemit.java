import javax.swing.JOptionPane;

public class willugoUtopianSteemit {
	public static void main (String args []) {
		String firstNumber;
		String secondNumber;
		int num1;
		int num2;
		int sum;

		firstNumber = JOptionPane.showInputDialog("Enter the First Number");
		if (firstNumber == null) {
			JOptionPane.showMessageDialog(null, "You have quit the program");
			System.exit(0);
		}

		else {
			secondNumber = JOptionPane.showInputDialog("Enter the Second Number");
			if (secondNumber == null) {
				JOptionPane.showMessageDialog(null, "You have quit the program");
				System.exit(0);
			}
			else {
				num1 = Integer.parseInt(firstNumber);
				num2 = Integer.parseInt(secondNumber);
				
				sum = num1 + num2;
				JOptionPane.showMessageDialog(null, "The sum of both numbers is " + sum);
			}
		}
	}
}



