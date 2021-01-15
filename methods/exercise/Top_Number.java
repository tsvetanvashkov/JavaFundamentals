package methods.exercise;

import java.util.Scanner;

public class Top_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		String output = getTopNumber(number);
		System.out.println(output);

		
	}

	private static String getTopNumber(int number) {
		String numbers = "";
		for (int i = 1; i <= number; i++) {
			if (getSumDigits(i) && getLastOdd(i)) {
				numbers += i + "\n"; 
			}
		}
		return numbers;
	}

	private static boolean getLastOdd(int i) {
		while (i > 0) {
			if ((i % 2) != 0) {
				return true;
			}
			else {
				i /= 10;
			}
		}
		return false;
		
	}

	private static boolean getSumDigits(int i) {
		int sum = 0;
		while (i > 0) {
			sum += i % 10;
			i /= 10;
		}
		if ((sum % 8) == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
