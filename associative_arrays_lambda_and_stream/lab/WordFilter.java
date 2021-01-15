package associative_arrays_lambda_and_stream.lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = Arrays.stream(scan.nextLine().split(" "))
				.filter(w -> (w.length() % 2) == 0)
				.toArray(String[]::new);
		scan.close();
		System.out.println(String.join(System.lineSeparator(), words));

	}

}
