package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		int sum = 0;
		String num = "" + number;
		
		for (int i = 0; i < num.length(); i++) {
			int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
			int factorial = 1;
			for (int j = 0; j < digit; j++) {
				factorial *= (digit - j) ;
			}
			sum += factorial;
		}
		
		if (sum == number) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		

	}

}
