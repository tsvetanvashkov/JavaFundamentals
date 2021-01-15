package associative_arrays_lambda_and_stream.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		Map<Character, Integer> count = new LinkedHashMap<Character, Integer>();
		for (char c : input.toCharArray()) {
			if (c != ' ') {
				Integer counter = count.get(c);
				if (counter == null) {
					counter = 0;
				}
				count.put(c, counter + 1);
			}
			
		}
		
		for (Map.Entry<Character, Integer> entry: count.entrySet()) {
			System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue());
		}
		
	}

}
