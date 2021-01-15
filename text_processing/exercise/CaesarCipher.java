package text_processing.exercise;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();
		String encrypt = "";
		for (int i = 0; i < text.length(); i++) {
			encrypt += (char)((int)text.charAt(i) + 3);
		}
		System.out.println(encrypt);

	}

}
