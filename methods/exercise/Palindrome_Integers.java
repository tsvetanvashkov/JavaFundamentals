package methods.exercise;

import java.util.Scanner;

public class Palindrome_Integers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		while (input.equals("END") != true) {
			boolean output = isPolindrome(input);
			System.out.println(output);
			input = scan.nextLine();
		}
		scan.close();

	}

	private static boolean isPolindrome(String input) {
		String first = "";
		String second = "";
		for (int i = 0; i < input.length() / 2; i++) {
			first += input.charAt(i);
		}
		if ((input.length() % 2) != 0) {
			for (int i = input.length() - 1; i > input.length() / 2; i--) {
				second += input.charAt(i);
			}
		}else {
			for (int i = input.length() - 1; i > (input.length() / 2) - 1; i--) {
				second += input.charAt(i);
			}
		}
		
		if (first.equals(second)) {
			return true;
		}else {
			return false;
		}
		
	}

}
