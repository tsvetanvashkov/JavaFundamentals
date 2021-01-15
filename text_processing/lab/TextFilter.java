package text_processing.lab;

import java.util.Scanner;

public class TextFilter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] bannedWord = scan.nextLine().split(", ");
		String text = scan.nextLine();
		scan.close();
		for (int i = 0; i < bannedWord.length; i++) {
			String replacement = "";
			for (int j = 0; j < bannedWord[i].length(); j++) {
				replacement += "*";
			}
			text= text.replaceAll(bannedWord[i], replacement);
		}
		System.out.println(text);

	}

}
