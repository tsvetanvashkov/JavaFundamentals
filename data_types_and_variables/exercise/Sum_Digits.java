package data_types_and_variables.exercise;

import java.util.Scanner;

public class Sum_Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		String num = "" + number;
		int sum = 0;
		
		for (int i = 0; i < num.length(); i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		
		System.out.println(sum);
		
	}

}
