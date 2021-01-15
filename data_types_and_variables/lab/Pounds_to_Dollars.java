package data_types_and_variables.lab;

import java.util.Scanner;

public class Pounds_to_Dollars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pounds = Double.parseDouble(scan.nextLine());
		scan.close();
		
		double dolars = pounds * 1.31;
		
		System.out.printf("%.3f", dolars);

	}

}
