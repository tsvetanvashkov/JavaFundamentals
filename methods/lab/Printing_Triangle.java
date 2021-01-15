package methods.lab;

import java.util.Scanner;

public class Printing_Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			printline(1, i);
		}
		for (int i = number -1; i >= 1 ; i--) {
			printline(1, i);
		}
		
		scan.close();

	}

	private static void printline(int i, int i2) {
		String output = "";
		for (int j = i; j <= i2; j++) {
			output += j + " ";
		}
		System.out.println(output);
	}

}
