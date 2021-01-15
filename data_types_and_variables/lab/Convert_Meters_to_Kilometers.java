package data_types_and_variables.lab;

import java.util.Scanner;

public class Convert_Meters_to_Kilometers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int meters = scan.nextInt();
		scan.close();
		
		double kilometers = (double)meters / 1000;
		
		System.out.printf("%.2f", kilometers);

	}

}
