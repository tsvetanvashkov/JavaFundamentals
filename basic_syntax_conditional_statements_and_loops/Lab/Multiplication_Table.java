package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number  = scan.nextInt();
		scan.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", number, i, (number * i));
		}

	}

}
