package methods.lab;

import java.util.Scanner;

public class Sign_of_Integer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		printSingOfInteger(number);
		scan.close();
		
	}

	private static void printSingOfInteger(int number) {
		
		if (number < 0) {
			System.out.printf("The number %d is negative.", number);
		}else if (number > 0) {
			System.out.printf("The number %d is positive.", number);
		}else {
			System.out.println("The number 0 is zero.");
		}
		
	}

}
