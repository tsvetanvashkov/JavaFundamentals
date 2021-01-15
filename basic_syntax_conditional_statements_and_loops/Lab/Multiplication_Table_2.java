package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Multiplication_Table_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number  = scan.nextInt();
		int multiplier = scan.nextInt();
		scan.close();
		
		for (int i = multiplier; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", number, i, (number * i));
		}
		
		if (multiplier > 10) {
			System.out.printf("%d X %d = %d\n", number, multiplier, (number * multiplier));
		}

	}

}
