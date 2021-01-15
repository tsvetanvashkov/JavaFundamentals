package methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_Power {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double number = Double.parseDouble(scan.nextLine());
		int power = scan.nextInt();
		scan.close();
		
		double output = numberOnPower(number, power);
		System.out.println(new DecimalFormat("0.####").format(output));

	}

	private static double numberOnPower(double number, int power) {
		double result = Math.pow(number, power);
		return result;
	}

}
