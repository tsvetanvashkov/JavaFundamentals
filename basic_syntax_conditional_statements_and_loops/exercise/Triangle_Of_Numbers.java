package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Triangle_Of_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
		
	}

}
