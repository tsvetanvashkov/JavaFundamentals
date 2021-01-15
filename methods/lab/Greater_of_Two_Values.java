package methods.lab;

import java.util.Scanner;

public class Greater_of_Two_Values {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type = scan.nextLine();
		String output = "";
		
		switch (type) {
		case "int":
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			scan.close();
			output = "" + getMax(number1, number2);
			break;
		case "char":
			char char1 = scan.next().charAt(0);
			char char2 = scan.next().charAt(0);
			scan.close();
			output = "" + getMax(char1, char2);
			break;
		case "string":
			String string1 = scan.nextLine();
			String string2 = scan.nextLine();
			scan.close();
			output = "" + getMax(string1, string2);
			break;
		}
		
		System.out.println(output);

	}
	
	private static String getMax(String string1, String string2) {
		int rsult = string1.compareTo(string2);
		if (rsult > 0) {
			return string1;
		}else {
			return string2;
		}
	
	}
	
	private static char getMax(char char1, char char2) {
		if (char1 > char2) {
			return char1;
		}else {
			return char2;
		}
	
	}

	private static int getMax(int number1, int number2) {
		if (number1 > number2) {
			return number1;
		}else {
			return number2;
		}
	
	}

}
