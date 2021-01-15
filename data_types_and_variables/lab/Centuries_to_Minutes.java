package data_types_and_variables.lab;

import java.util.Scanner;

public class Centuries_to_Minutes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int centuries = scan.nextInt();
		int years = centuries * 100;
		int days = (int)(years * 365.2422);
		int hours = days * 24;
		int minutes = hours * 60;
		
		System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, minutes);
		scan.close();
		
	}

}
