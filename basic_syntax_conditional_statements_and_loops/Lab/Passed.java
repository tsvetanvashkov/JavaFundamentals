package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Passed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grade = Double.parseDouble(scan.nextLine());
		scan.close();
		String out = "";
		
		if (grade >= 3.00) {
			out = "Passed!";
		}
		
		System.out.println(out);
		
	}

}
