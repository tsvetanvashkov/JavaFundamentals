package text_processing.lab;

import java.util.Scanner;

public class RepeatString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = scan.nextLine().split(" ");
		String output = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				output += words[i];
			}
		}
		scan.close();
		System.out.println(output);

	}

}
