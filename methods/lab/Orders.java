package methods.lab;

import java.util.Scanner;

public class Orders {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String product = scan.nextLine();
		int quantity = scan.nextInt();
		scan.close();
		totalPrice(product, quantity);

	}

	private static void totalPrice(String product, int quantity) {
		double price = 0.0;
		switch (product) {
		case "coffee":
			price = quantity * 1.5;
			break;
		case "water":
			price = quantity * 1.0;
			break;
		case "coke":
			price = quantity * 1.4;
			break;
		case "snacks":
			price = quantity * 2.0;
			break;
		}
		System.out.printf("%.2f", price);
		
	}

}
