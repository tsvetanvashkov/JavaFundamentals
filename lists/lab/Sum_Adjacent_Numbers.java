package lists.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sum_Adjacent_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		scan.close();
		List<Double> numbers = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			numbers.add(Double.parseDouble(input[i]));
		}
		String output = getCalculation(numbers);
		System.out.println(output);

	}

	private static String getCalculation(List<Double> numbers) {
		int count = 0;
		while (count < (numbers.size() - 1)) {
			if (numbers.get(count).equals(numbers.get(count + 1))) {
				numbers.set(count, (numbers.get(count) + numbers.get(count + 1)));
				numbers.remove(count + 1);
				count = 0;
				continue;
			}
			count++;
		}
		String output = joinElementsByDelimiter(numbers, " ");
		return output;
	}

	private static String joinElementsByDelimiter(List<Double> numbers, String delimiter) {
		String output = "";
		for (Double index : numbers) {
			output += (new DecimalFormat("0.#").format(index) + delimiter);
		}
		return output;
	}

}
