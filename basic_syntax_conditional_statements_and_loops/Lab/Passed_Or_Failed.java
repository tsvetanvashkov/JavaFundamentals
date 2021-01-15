package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Passed_Or_Failed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grade = Double.parseDouble(scan.nextLine());
		scan.close();
		String out = "";
		
		if (grade >= 3.00) {
			out = "Passed!";
		}else {
			out = "Failed!";
		}
		
		System.out.println(out);

	}

}
