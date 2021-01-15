package exam_13_12_2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		String regex = "U\\$(?<name>[A-Z][a-z]{2,})U\\$P@\\$(?<pass>[a-z]{5,}\\d+)P@\\$";
		Pattern pattern = Pattern.compile(regex);
		int count = 0;
		while (number > 0) {
			String input = scan.nextLine();
			Matcher matcher = pattern.matcher(input);
			if (matcher.find()) {
				System.out.println("Registration was successful");
				String username = matcher.group("name");
				String password = matcher.group("pass");
				System.out.printf("Username: %s, Password: %s\n", username, password);
				count++;
			}else {
				System.out.println("Invalid username or password");
			}
			number--;
		}
		scan.close();
		System.out.printf("Successful registrations: %d", count);

	}

}
