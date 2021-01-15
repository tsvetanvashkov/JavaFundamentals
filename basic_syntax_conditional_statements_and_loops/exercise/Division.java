package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int out = 0;
		boolean notDivisible = false;
		
		if ((number % 10) == 0) {
			out = 10;
		}else if ((number % 7) == 0) {
			out = 7;
		}else if ((number % 6) == 0) {
			out = 6;
		}else if ((number % 3) == 0) {
			out = 3;
		}else if ((number % 2) == 0) {
			out = 2;
		}else {
			notDivisible = true;
		}
		
		if (notDivisible) {
			System.out.println("Not divisible");
		}else {
			System.out.printf("The number is divisible by %d", out);
		}

	}

}
