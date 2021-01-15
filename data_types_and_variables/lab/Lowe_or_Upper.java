package data_types_and_variables.lab;

import java.util.Scanner;

public class Lowe_or_Upper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letter = scan.nextLine();
		scan.close();
		
		int ch = letter.charAt(0);
		String output;
		
		if (ch < 97) {
			output = "upper-case";
		}else {
			output = "lower-case";
		}
		
		System.out.println(output);

	}

}
