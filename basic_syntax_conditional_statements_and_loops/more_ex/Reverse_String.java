package basic_syntax_conditional_statements_and_loops.more_ex;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		String output = "";
		
		for (int i = (input.length() - 1); i >= 0 ; i--) {
			output += input.charAt(i);
		}
		
		System.out.println(output);

	}

}
