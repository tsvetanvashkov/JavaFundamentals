package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Theatre_Promotions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String day = scan.nextLine().toLowerCase();
		int age = scan.nextInt();
		scan.close();
		double price = 0.0;
		
		switch (day) {
		case "weekday":
			if (((0 <= age) && (age <= 18)) || ((64 < age) && (age <= 122))) {
				price = 12;
			}else if ((18 < age) && (age <= 64)) {
				price = 18;
			}
			break;
		case "weekend":
			if (((0 <= age) && (age <= 18)) || ((64 < age) && (age <= 122))) {
				price = 15;
			}else if ((18 < age) && (age <= 64)) {
				price = 20;
			}
			break;
		case "holiday":
			if ((0 <= age) && (age <= 18)) {
				price = 5;
			}else if ((18 < age) && (age <= 64)) {
				price = 12;
			}else if ((64 < age) && (age <= 122)) {
				price = 10;
			}
			break;
		}
		
		if (price != 0.0) {
			System.out.printf("%.0f$", price);
		}else {
			System.out.println("Error!");
		}

	}

}
