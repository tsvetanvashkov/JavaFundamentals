package methods.lab;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double number = Double.parseDouble(scan.nextLine());
		printsTheCorrespondingGradeInWords(number);
		scan.close();

	}

	private static void printsTheCorrespondingGradeInWords(double number) {
		String output = "";
		if ((2 <= number) && (number <= 2.99)) {
			output = "Fail";
		}else if ((2.99 < number) && (number <= 3.49)) {
			output = "Poor";
		}else if ((3.49 < number) && (number <= 4.49)) {
			output = "Good";
		}else if ((4.49 < number) && (number <= 5.49)) {
			output = "Very good";
		}else if ((5.49 < number) && (number <= 6)) {
			output = "Excellent";
		}
		System.out.println(output);
		
	}

}
