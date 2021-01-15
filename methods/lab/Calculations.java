package methods.lab;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		scan.close();
		
		switch (input) {
		case "add":
			add(number1, number2);
			break;
		case "multiply":
			multiply(number1, number2);
			break;
		case "subtrack":
			subtrack(number1, number2);
			break;
		case "divide":
			divide(number1, number2);
			break;
		}

	}

	private static void divide(int number1, int number2) {
		int output = number1 / number2;
		System.out.println(output);
		
	}

	private static void subtrack(int number1, int number2) {
		int output = number1 - number2;
		System.out.println(output);
		
	}

	private static void multiply(int number1, int number2) {
		int output = number1 * number2;
		System.out.println(output);
		
	}

	private static void add(int number1, int number2) {
		int output = number1 + number2;
		System.out.println(output);
		
	}

}
