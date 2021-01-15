package arrays.lab;

import java.util.Scanner;

public class Even_and_Odd_Subtractin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] numbers = input.split(" ");
		int sumEven = 0;
		int sumOdd = 0;
		scan.close();
		
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			if ((num % 2) == 0) {
				sumEven += num;
			}else {
				sumOdd += num;
			}
		}
		
		System.out.printf("%d", sumEven - sumOdd);

	}

}
