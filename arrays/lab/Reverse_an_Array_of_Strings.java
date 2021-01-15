package arrays.lab;

import java.util.Scanner;

public class Reverse_an_Array_of_Strings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[ ] input = scan.nextLine().split(" ");
		scan.close();
		
		for (int i = 0; i < (input.length / 2); i++) {
			String swap = input[input.length - 1 -i];
			input[input.length - 1 - i] = input[i];
			input[i] = swap;
		}
		
		System.out.println(String.join(" ", input));
		

	}

}
