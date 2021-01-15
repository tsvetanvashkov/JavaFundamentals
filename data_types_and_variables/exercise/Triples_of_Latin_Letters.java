package data_types_and_variables.exercise;

import java.util.Scanner;

public class Triples_of_Latin_Letters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		char firsChar;
		char secondChar;
		char thirdChar;
		
		for (int i = 0; i < number; i++) {
			firsChar = (char)('a' + i);
			for (int j = 0; j < number; j++) {
				secondChar = (char)('a' + j);
				for (int j2 = 0; j2 < number; j2++) {
					thirdChar = (char)('a' + j2);
					System.out.printf("%c%c%c\n", firsChar, secondChar, thirdChar);
				}
			}
		}

	}

}
