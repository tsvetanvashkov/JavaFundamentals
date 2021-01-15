package data_types_and_variables.exercise;

import java.util.Scanner;

public class Sum_of_Chars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			String input = scan.nextLine();
			int ch = input.charAt(0);
			sum += ch;
			
		}
		
		System.out.printf("The sum equals: %d", sum);
		scan.close();

	}

}
