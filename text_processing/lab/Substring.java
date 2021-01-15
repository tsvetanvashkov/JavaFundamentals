package text_processing.lab;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String sequance = scan.nextLine();
		scan.close();
		while (sequance.contains(word)) {
			sequance = sequance.replaceFirst(word, "");
		}
		System.out.println(sequance);

	}

}
