package associative_arrays_lambda_and_stream.lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		Map<String, List<String>> words = new LinkedHashMap<String, List<String>>();
		while (num > 0) {
			String inputWord = scan.nextLine();
			String inputSynonym = scan.nextLine();
			
			List<String> wordSysnonym = words.get(inputWord);
			if (wordSysnonym == null) {
				wordSysnonym = new ArrayList<String>();
				words.put(inputWord, wordSysnonym);
			}
			wordSysnonym.add(inputSynonym);
			num--;
		}
		scan.close();
		for (Map.Entry<String, List<String>> entry : words.entrySet()) {
			System.out.printf("%s - %s\n", entry.getKey(), String.join(", ", entry.getValue()));
		}

	}

}
