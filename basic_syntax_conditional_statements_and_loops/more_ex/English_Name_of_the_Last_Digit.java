package basic_syntax_conditional_statements_and_loops.more_ex;

import java.util.Scanner;

public class English_Name_of_the_Last_Digit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		String lastDigit = englishName(num);
		
		System.out.println(lastDigit);

	}

	private static String englishName(int num) {
		int lastNum = num % 10;
		String english;
		
		switch (lastNum) {
		case 1:
			english = "one";
			break;
		case 2:
			english = "two";
			break;
		case 3:
			english = "three";
			break;
		case 4:
			english = "four";
			break;
		case 5:
			english = "five";
			break;
		case 6:
			english = "six";
			break;
		case 7:
			english = "seven";
			break;
		case 8:
			english = "eight";
			break;
		case 9:
			english = "nine";
			break;
		default:
			english = "zero";
			break;
		}
		
		return english;
		
	}

}
