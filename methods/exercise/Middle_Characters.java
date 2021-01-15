package methods.exercise;

import java.util.Scanner;

public class Middle_Characters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		printMiddleCharacter(input);

	}

	private static void printMiddleCharacter(String input) {
		String output = "" + input.charAt(input.length() / 2);
		if ((input.length() % 2) == 0) {
			output = input.charAt((input.length() / 2) - 1) + output;
		} 
		
		System.out.println(output);
		
	}

}
