package data_types_and_variables.exercise;

import java.util.Scanner;

public class Space_Must_Flow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int days = 0;
		int totalSpice = 0;
		
		while (number >= 100) {
			totalSpice += number - 26;
			days++;
			number -= 10;
			
		}
		if (days != 0) {
			totalSpice -= 26;
		}
		
		System.out.printf("%d\n%d\n", days, totalSpice);

	}

}
