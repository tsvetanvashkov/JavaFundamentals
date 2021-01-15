package text_processing.exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();
		String output = "";
		char charBefore = 0;
		for (int i = 0; i < text.length(); i++) {
			char charNow = text.charAt(i);
			if (charNow == charBefore) {
				continue;
			}
			charBefore = charNow;
			output += charNow;
		}
		System.out.println(output);

	}

}
