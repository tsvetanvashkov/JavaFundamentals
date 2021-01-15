package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Sum_Of_Odd_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number  = scan.nextInt();
		scan.close();
		int sum = 0;
		
		number *= 2;
		
		for (int i = 1; i <= number; i += 2 ) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.printf("Sum: %d", sum);

	}

}
