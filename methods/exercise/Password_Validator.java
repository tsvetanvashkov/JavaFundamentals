package methods.exercise;

import java.util.Scanner;

public class Password_Validator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output = checkPassword(input);
		System.out.println(output);
		scan.close();

	}

	private static String checkPassword(String input) {
		String result = "";
		boolean length = passwordLength(input);
		boolean characters = passwordCharacters(input);
		boolean twoDigits = passwordTwoDigits(input);
		if (length && characters && twoDigits) {
			result += "Password is valid";
		} else {
			if (length == false) {
				result += "Password must be between 6 and 10 characters\n";
			}
			if (characters == false) {
				result += "Password must consist only of letters and digits\n";
			}
			if ( twoDigits == false) {
				result += "Password must have at least 2 digits";
			}
		}
		return result;
	}

	private static boolean passwordTwoDigits(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				count++;
			}
			if (count == 2) {
				return true;
			}
		}
		return false;
	}

	private static boolean passwordCharacters(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetterOrDigit(input.charAt(i)) != true) {
				return false;
			}
		}
		return true;
	}

	private static boolean passwordLength(String input) {
		if (6 <= input.length() && input.length() <= 10) {
			return true;
		}
		return false;
	}

}
