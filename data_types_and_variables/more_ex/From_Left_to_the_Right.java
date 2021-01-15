package data_types_and_variables.more_ex;

import java.util.Scanner;

public class From_Left_to_the_Right {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lines = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < lines; i++) {
			String input = scan.nextLine();
			int firstNum = 0;
			int secondNum = 0;
			boolean numberF = true;
			for (int j = 0; j < input.length(); j++) {
				char ch = input.charAt(j);
				if (ch == ' ') {
					numberF = false;
					continue;
				}
				if (numberF) {
					firstNum += ((int)ch - 48);
				}else {
					secondNum += ((int)ch - 48);
				}
				
			}
			if (firstNum > secondNum) {
				System.out.println(firstNum);
			}else {
				System.out.println(secondNum);
			}
			
		}
		
		scan.close();

	}

}
