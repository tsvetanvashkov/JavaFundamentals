package text_processing.exercise;

import java.util.Scanner;

public class MultiplyBigNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String bigNumber = scan.next();
		int digit = scan.nextInt();
		scan.close();
		String multiply = "";
		int decimal = 0;
		if (digit == 0) {
			multiply = "0";
		}else {
			for (int i = (bigNumber.length() - 1); i >= 0; i--) {
				int number = ((int)(bigNumber.charAt(i) - 48) * digit) + decimal;
				multiply = (number % 10) + multiply;
				if ((number / 10) > 0) {
					decimal = number / 10;
					if (i == 0) {
						multiply = decimal + multiply;
					}
				}else {
					decimal = 0;
				}
			
			}
			while (multiply.startsWith("0")) {
				multiply = multiply.replaceFirst("0", "");
			}
		}
		
		
		System.out.println(multiply);
		
	}

}
