package regular_expressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		scan.close();
		String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher phoneMatcher = pattern.matcher(number);
		List<String> output = new ArrayList<String>();
		while (phoneMatcher.find()) {
			output.add(phoneMatcher.group());
		}
		System.out.println(String.join(", ", output));

	}

}