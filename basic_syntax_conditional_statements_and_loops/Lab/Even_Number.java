package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number  = scan.nextInt();
		
		while ((Math.abs(number) % 2) == 1) {
			System.out.println("Please write an even number.");
			number = scan.nextInt();
		}
		
		System.out.printf("The number is: %d", Math.abs(number));
		scan.close();

	}

}
