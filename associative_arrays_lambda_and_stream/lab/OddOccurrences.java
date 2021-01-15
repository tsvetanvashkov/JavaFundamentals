package associative_arrays_lambda_and_stream.lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		scan.close();
		Map<String, Integer> words = new LinkedHashMap<String, Integer>();
		
		for (String string : input) {
			String word = string.toLowerCase();
			Integer counter = words.get(word);
			if (counter == null) {
				counter = 0;
			}
			words.put(word, counter + 1);
			
		}
		
		List<String> output = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : words.entrySet()) {
			if ((entry.getValue() % 2) != 0) {
				output.add(entry.getKey());
			}
		}
	
		System.out.println(String.join(", ", output));

	}

}
