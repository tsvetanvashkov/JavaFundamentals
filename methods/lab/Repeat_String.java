package methods.lab;

import java.util.Scanner;

public class Repeat_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int number = scan.nextInt();
		scan.close();
		String output = repeat(input, number);
		System.out.println(output);
		
	}

	private static String repeat(String input, int number) {
		String result = "";
		for (int i = 0; i < number; i++) {
			result += input;
		}
		
		return result;
	}

}
