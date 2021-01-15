package methods.lab;

import java.util.Scanner;

public class Multiply_Evens_by_Odds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Math.abs(scan.nextInt());
		scan.close();
		int output = getMultipleIfEvensAndOdds(number);
		System.out.println(output);

	}

	private static int getMultipleIfEvensAndOdds(int number) {
		int evenSum = getSumOfEvens(number);
		int oddSum = getSumOfOdds(number);
		int result = evenSum * oddSum;
		return result;
	}

	private static int getSumOfOdds(int number) {
		int oddSum = 0;
		while (number != 0) {
			if (number % 2 != 0) {
				oddSum += number % 10;
			}
			number /= 10;
		}
		return oddSum;
	}

	private static int getSumOfEvens(int number) {
		int evenSum = 0;
		while (number != 0) {
			if (number % 2 == 0) {
				evenSum += number % 10;
			}
			number /= 10;
		}
		return evenSum;
	}

}
