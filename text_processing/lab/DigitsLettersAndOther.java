package text_processing.lab;

import java.util.Scanner;

public class DigitsLettersAndOther {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		scan.close();
		String digit = "";
		String letter = "";
		String symbol = "";
		for (int i = 0; i < word.length(); i++) {
			char input = word.charAt(i);
			if (Character.isDigit(input)) {
				digit += input;
			}else if (Character.isLetter(input)) {
				letter += input;
			}else {
				symbol += input;
			}
		}
		System.out.println(digit);
		System.out.println(letter);
		System.out.println(symbol);

	}

}
