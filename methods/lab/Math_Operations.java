package methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_Operations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1 = Integer.parseInt(scan.nextLine());
		String operator = scan.nextLine();
		int number2 = Integer.parseInt(scan.nextLine());
		scan.close();
		
		double output = calculate(number1, operator, number2);
		System.out.println(new DecimalFormat("0.##").format(output));

	}

	private static double calculate(int number1, String operator, int number2) {
		double result = 0.0;
		
		switch (operator) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
		}
		
		return result;
	}

}
