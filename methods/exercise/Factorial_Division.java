package methods.exercise;

import java.util.Scanner;

public class Factorial_Division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		scan.close();
		double output = getDevision(first, second);
		
		System.out.printf("%.2f", output);

	}

	private static double getDevision(int first, int second) {
		double firstFact = getFactorial(first);
		double secondFact = getFactorial(second);
		double output = firstFact / secondFact;
		return output;
	}

	private static double getFactorial(int number) {
		double factorial = 1;
		for (int i = 0; i < number; i++) {
			factorial *= number - i;
		}
		return factorial;
	}

}
