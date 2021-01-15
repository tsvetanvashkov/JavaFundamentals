package associative_arrays_lambda_and_stream.exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Orders {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, List<Double>> products = new LinkedHashMap<String, List<Double>>();
		String input = scan.nextLine();
		while (!input.equals("buy")) {
			String[] product = input.split(" ");
			String name = product[0];
			double price = Double.parseDouble(product[1]);
			double quantity = Double.parseDouble(product[2]);
			List<Double> values = products.get(name);
			if (values == null) {
				values = new ArrayList<Double>();
				values.add(price);
				values.add(quantity);
				products.put(name, values);
			}else {
				if (values.get(0) != price) {
					values.set(0, price);
				}
				values.set(1, values.get(1) + quantity);
			}
			input = scan.nextLine();
		}
		scan.close();
		
		for (Map.Entry<String, List<Double>> entry : products.entrySet()) {
			List<Double> totalList = entry.getValue();
			Double totalPrice = totalList.get(0) * totalList.get(1);
			System.out.printf("%s -> %.2f\n", entry.getKey(), totalPrice);
		}
		
	}

}
