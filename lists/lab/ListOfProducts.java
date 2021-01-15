package lists.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> products = new ArrayList<String>();
		products = getInput(scan);
		products = sortProducts(products);
		printing(products);

	}

	private static void printing(List<String> products) {
		for (int i = 0; i < products.size(); i++) {
			System.out.printf("%d.%s\n", (i + 1), products.get(i));
		}
		
	}

	private static List<String> sortProducts(List<String> products) {
		products.sort(null);
		return products;
	}

	private static List<String> getInput(Scanner scan) {
		int num = Integer.parseInt(scan.nextLine());
		List<String> output = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			output.add(scan.nextLine());
		}
		return output;
	}

}
