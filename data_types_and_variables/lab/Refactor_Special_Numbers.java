package data_types_and_variables.lab;

import java.util.Scanner;

public class Refactor_Special_Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		boolean isSpecialNum = false;
		for (int i = 1; i <= input; i++) {
		     int num = i;
		    while (i > 0) {
		        sum += i % 10;
		        i = i / 10;
		    }
		    isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
		    System.out.printf("%d -> %b\n", num, isSpecialNum);
		    sum = 0;
		    i = num;
		}
		scanner.close();

	}

}
