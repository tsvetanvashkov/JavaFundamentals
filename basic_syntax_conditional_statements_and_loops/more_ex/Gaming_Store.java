package basic_syntax_conditional_statements_and_loops.more_ex;

import java.util.Scanner;

public class Gaming_Store {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double money = Double.parseDouble(scan.nextLine());
		String game = scan.nextLine();
		double spentMoney = money;
		
		while (game.equals("Game Time") != true) {
			double price = 0;
			boolean notFound = false;
			
			switch (game) {
			case "OutFall 4":
				price = 39.99;
				break;
			case "CS: OG":
				price = 15.99;
				break;
			case "Zplinter Zell":
				price = 19.99;
				break;
			case "Honored 2":
				price = 59.99;
				break;
			case "RoverWatch":
				price = 29.99;
				break;
			case "RoverWatch Origins Edition":
				price = 39.99;
				break;
			default:
				notFound = true;
				break;
				
			}
			
			if (notFound) {
				System.out.println("Not Found");
			}else {
				if (price <= spentMoney) {
					System.out.println("Bought " + game);
					spentMoney -= price;
				}else {
					System.out.println("Too Expensive");
				}
			}
			
			
			if (spentMoney == 0) {
				System.out.println("Out of money!");
				scan.close();
				return;
			}
			
			game = scan.nextLine();
			
		}
		
		System.out.printf("Total spent: $%.2f. Remaining: $%.2f", (money -spentMoney), spentMoney);
		scan.close();

	}

}
