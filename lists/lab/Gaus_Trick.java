package lists.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gaus_Trick {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		scan.close();
		List<Double> numbers = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			numbers.add(Double.parseDouble(input[i]));
		}
		String output = getSumOfList(numbers);
		System.out.println(output);

	}

	private static String getSumOfList(List<Double> numbers) {
		int length = numbers.size();
		for (int i = 0; i < length / 2; i++) {
			numbers.set(i, (numbers.get(i) + numbers.get(numbers.size() - 1)));
			numbers.remove(numbers.size() - 1);
		}
		String output = getString(numbers, " ");
		return output;
	}

	private static String getString(List<Double> numbers, String delimiter) {
		String output = "";
		for (Double index : numbers) {
			output += (new DecimalFormat("0.#").format(index) + delimiter);
		}
		return output;
	}

}
