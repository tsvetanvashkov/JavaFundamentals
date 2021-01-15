package text_processing.exercise;

import java.util.Scanner;

public class CharacterMultiplier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String first = scan.next();
		String second = scan.next();
		scan.close();
		int sum = 0;
		boolean check = false;
		for (int i = 0; i < first.length(); i++) {
			if (second.length() == i) {
				check = true;
				break;
			}
			sum += (first.codePointAt(i) * second.codePointAt(i));
			
		}
		if (check) {
			for (int i = second.length(); i < first.length(); i++) {
				sum += first.codePointAt(i);
			}
		}else {
			for (int i = first.length(); i < second.length(); i++) {
				sum += second.codePointAt(i);
			}
		}
		System.out.println(sum);

	}

}
