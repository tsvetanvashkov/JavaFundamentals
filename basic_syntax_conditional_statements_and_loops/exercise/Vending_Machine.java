package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Vending_Machine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double totalMoney = 0;
		
		while (input.equals("Start") != true) {
			double money = Double.parseDouble(input);
			if ((money == 0.1) || (money == 0.2) || (money == 0.5) || (money == 1.0) || (money == 2.0)) {
				totalMoney += money;
			}else {
				System.out.printf("Cannot accept %.2f\n", money);
			}
			input = scan.nextLine();
		}
		
		input = scan.nextLine();
		
		while (input.equals("End") != true) {
			double price = 0;
			switch (input) {
				case "Nuts":
					price = 2;
					break;
				case "Water":
					price = 0.7;
					break;
				case "Crisps":
					price = 1.5;
					break;
				case "Soda":
					price = 0.8;
					break;
				case "Coke":
					price = 1;
					break;

			default:
				System.out.println("Invalid product");
				break;
			}
			
			if (price != 0) {
				if (totalMoney < price) {
					System.out.println("Sorry, not enough money");
				}else {
					System.out.printf("Purchased %s\n", input);
					totalMoney -= price;
				}
			}
			
			input = scan.nextLine();
			
		}
		
		System.out.printf("Change: %.2f", totalMoney);
		scan.close();

	}

}
