package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Print_And_Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberStart = scan.nextInt();
		int numberEnd = scan.nextInt();
		scan.close();
		int sum = 0;
		
		for (int i = numberStart; i <= numberEnd; i++) {
			sum += i;
			System.out.printf("%d ", i);
		}
		
		System.out.printf("\nSum: %d", sum);

	}

}
