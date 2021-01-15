package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Rage_Expenses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lostGamesCount = Integer.parseInt(scan.nextLine());
		double priceHeadset = Double.parseDouble(scan.nextLine());
		double priceMouse = Double.parseDouble(scan.nextLine());
		double priceKeyboard = Double.parseDouble(scan.nextLine());
		double priceDisplay = Double.parseDouble(scan.nextLine());
		scan.close();
		
		int headset = 0;
		int mouse = 0;
		int keyboard = 0;
		int display = 0;
		double totalPrice = 0;
		
		for (int i = 1; i <= lostGamesCount; i++) {
			boolean countKeyboard = false;
			if ((i % 2) == 0) {
				headset++;
				countKeyboard = true;
			}if ((i % 3) == 0) {
				mouse++;
				if (countKeyboard) {
					keyboard++;
					if ((keyboard % 2) == 0) {
						display++;
					}
				}
			}
		}
		
		totalPrice = (headset * priceHeadset) + (mouse * priceMouse) + (keyboard * priceKeyboard) + (display * priceDisplay);
		
		System.out.printf("Rage expenses: %.2f lv.", totalPrice);

	}

}
