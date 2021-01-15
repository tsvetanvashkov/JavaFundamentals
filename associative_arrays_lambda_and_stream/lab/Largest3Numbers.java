package associative_arrays_lambda_and_stream.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> input = Arrays.stream(scan.nextLine().split(" "))
				.map(Integer::parseInt)
				.sorted((n1, n2) -> n2.compareTo(n1))
				.collect(Collectors.toList());
		scan.close();
		int lenght = 3;
		if (input.size() < 3) {
			lenght = input.size();
		}
		for (int i = 0; i < lenght; i++) {
			System.out.print(input.get(i));
			if (i < lenght - 1) {
				System.out.print(" ");
			}
		}

	}

}
