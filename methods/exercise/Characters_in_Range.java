package methods.exercise;

import java.util.Scanner;

public class Characters_in_Range {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char first = scan.next().charAt(0);
		char second = scan.next().charAt(0);
		scan.close();
		String output = getCharactersRange(first, second);
		System.out.println(output);

	}

	private static String getCharactersRange(char first, char second) {
		String range = "";
		if (first > second) {
			char swap = first;
			first = second;
			second = swap;
		}
		for (int i = first + 1; i < second; i++) {
			range += (char)i + " ";
		}
		
		return range;
	}

}
