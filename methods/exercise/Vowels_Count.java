package methods.exercise;

import java.util.Scanner;

public class Vowels_Count {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		int output = getVowelsCount(input);
		System.out.println(output);

	}

	private static int getVowelsCount(String input) {
		int count = 0;
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'i' || input.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

}
