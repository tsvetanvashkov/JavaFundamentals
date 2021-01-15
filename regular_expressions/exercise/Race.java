package regular_expressions.exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(", ");
		Map<String, Integer> racers = new HashMap<String, Integer>();
		int lengthInput = input.length - 1;
		while (lengthInput >= 0) {
			racers.put(input[lengthInput], 0);
			lengthInput--;
		}
		String letter = "[A-Za-z]";
		String digit = "\\d";
		Pattern patternLetter = Pattern.compile(letter);
		Pattern patternDigit = Pattern.compile(digit);
		String text = scan.nextLine();
		while (!text.equals("end of race")) {
			Matcher matcherLetter = patternLetter.matcher(text);
			Matcher matcherDigit = patternDigit.matcher(text);
			StringBuilder nameSB = new StringBuilder();
			while (matcherLetter.find()) {
				nameSB.append(matcherLetter.group());
			}
			String name = nameSB.toString();
			int distance = 0;
			while (matcherDigit.find()) {
				distance += Integer.parseInt(matcherDigit.group());
			}
			Integer value = racers.get(name);
			if (value != null) {
				racers.put(name, value + distance);
			}
			text = scan.nextLine();
		}
		scan.close();
		List<String> print = racers.entrySet().stream()
			.sorted((f, s) -> {
				int result = s.getValue() - f.getValue();
				return result;
			}).limit(3)
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
		
		int count = 0;
		for (String name : print) {
			switch (count++) {
			case 0:
				System.out.printf("1st place: %s\n", name);
				break;
			case 1:
				System.out.printf("2nd place: %s\n", name);
				break;
			case 2:
				System.out.printf("3rd place: %s\n", name);
				break;
			}
		}
		
	}

}
