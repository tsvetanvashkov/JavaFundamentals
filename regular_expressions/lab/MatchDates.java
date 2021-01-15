package regular_expressions.lab;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatchDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();
		String regex = "\\b(?<day>\\d{2})([./-])(?<month>[A-Z][a-z]{2})(\\2)(?<year>\\d{4})\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher date = pattern.matcher(text);
		while (date.find()) {
			String day = date.group("day");
			String month = date.group("month");
			String year = date.group("year");
			System.out.printf("Day: %s, Month: %s, Year: %s\n", day, month, year);
		}

	}

}
