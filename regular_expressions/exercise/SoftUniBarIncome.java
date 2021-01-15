package regular_expressions.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[\\d]+)\\|[^|$%.]*?(?<price>\\d+|\\d+\\.?\\d*)\\$";
		Pattern pattern = Pattern.compile(regex);
		double totalMoney = 0.0;
		while (!input.equals("end of shift")) {
			Matcher matcher = pattern.matcher(input);
			if (matcher.find()) {
				String name = matcher.group("name");
				String product = matcher.group("product");
				int count = Integer.parseInt(matcher.group("count"));
				double price = Double.parseDouble(matcher.group("price"));
			
				price *= count;
				totalMoney += price;
				System.out.printf("%s: %s - %.2f\n", name, product, price);
			}

			input = scan.nextLine();
		}
		scan.close();
		System.out.printf("Total income: %.2f", totalMoney);
		
	}

}
