package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		String persons = scan.nextLine();
		String day = scan.nextLine();
		scan.close();
		double price = 0;
		double totalPrice = 0;
		
		if (persons.equals("Students")) {
			if (day.equals("Friday")) {
				price = 8.45;
			}else if (day.equals("Saturday")) {
				price = 9.8;
			}else if (day.equals("Sunday")) {
				price = 10.46;
			}
			
			totalPrice = price * number;
			if (number >= 30) {
				totalPrice *= (1 - 0.15);
			}
			
		}else if (persons.equals("Business")) {
			if (day.equals("Friday")) {
				price = 10.9;
			}else if (day.equals("Saturday")) {
				price = 15.6;
			}else if (day.equals("Sunday")) {
				price = 16;
			}

			if (number >= 100) {
				totalPrice = price * (number - 10);
			}else {
				totalPrice = price * number;
			}
			
		}else if (persons.equals("Regular")) {
			if (day.equals("Friday")) {
				price = 15;
			}else if (day.equals("Saturday")) {
				price = 20;
			}else if (day.equals("Sunday")) {
				price = 22.5;
			}

			totalPrice = price * number;
			if ((number >= 10) && (number <= 20)) {
				totalPrice *= (1 - 0.05);
			}
		}
		
		System.out.printf("Total price: %.2f", totalPrice);

	}

}
