package text_processing.exercise;

import java.util.Scanner;

public class ValidUsername {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] usernames = scan.nextLine().split(", ");
		scan.close();
		for (int i = 0; i < usernames.length; i++) {
			if ((usernames[i].length() >= 3) && (usernames[i].length() <= 16)) {
				boolean cheking = true;
				for (int j = 0; j < usernames[i].length(); j++) {
					char charakter = usernames[i].charAt(j);
					if ((charakter != '-') && charakter != '_' && (!Character.isLetterOrDigit(charakter))) {
						cheking = false;
						break;
					}
				}
				if (cheking) {
					System.out.println(usernames[i]);
				}
			}
		}
		

	}

}
