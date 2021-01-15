package regular_expressions.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String regex = ">>(?<name>\\w+)<<(?<price>\\d+|\\d+\\.?\\d*)!(?<quantity>\\d+)";
		Pattern pattern = Pattern.compile(regex);
		List<String> boughtFurniture = new ArrayList<String>(); 
		double sum = 0;
		while (!input.equals("Purchase")) {
			Matcher furniture = pattern.matcher(input);
			if (furniture.find()) {
				String name = furniture.group("name");
				double price = Double.parseDouble(furniture.group("price"));
				int quantity = Integer.parseInt(furniture.group("quantity"));
				boughtFurniture.add(name);
				sum += (price * quantity);
			}
			input = scan.nextLine();
		}
		scan.close();
		System.out.println("Bought furniture:");
		for (String furniture : boughtFurniture) {
			System.out.println(furniture);
		}
		System.out.printf("Total money spend: %.2f", sum);

	}

}
