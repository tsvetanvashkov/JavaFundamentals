package text_processing.exercise;

import java.util.Scanner;

public class LettersChangeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\s+");
		scan.close();
		double sum = 0;
		for (int i = 0; i < input.length; i++) {
			String sequence = input[i];
			char first = sequence.charAt(0);
			double number = Double.parseDouble(sequence.substring(1, sequence.length() - 1));
			char second = sequence.charAt(sequence.length() - 1);
			int firstLetterPosition = getLetterPosition(first);
			int secondLetterPosition = getLetterPosition(second);
			if (Character.isLowerCase(first)) {
				sum += number * firstLetterPosition;
			}else if (Character.isUpperCase(first)) {
				sum += number / firstLetterPosition;
			}
			if (Character.isLowerCase(second)) {
				sum += secondLetterPosition;
			}else if (Character.isUpperCase(second)) {
				sum -= secondLetterPosition;
			}

		}
		System.out.printf("%.2f", sum);

	}

	private static int getLetterPosition(char c) {
		char targetChar = Character.toLowerCase(c);
		char initialChar = 'a';
		int position = targetChar - initialChar + 1;
		return position;
	}

}
