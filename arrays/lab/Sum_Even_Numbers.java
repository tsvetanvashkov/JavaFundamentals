package arrays.lab;

import java.util.Scanner;

public class Sum_Even_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] numbers = input.split(" ");
		int sum = 0;
		scan.close();
		
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			if ((num % 2) == 0) {
				sum += num;
			}
		}
		
		System.out.println(sum);

	}

}
