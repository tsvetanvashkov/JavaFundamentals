package data_types_and_variables.lab;

import java.util.Scanner;

public class Special_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		int sum;
		for (int i = 1; i <= number; i++) {
			sum = (i % 10) + (int)(i /10);
			if (sum == 5 || sum == 7 || sum == 11) {
				System.out.printf("%d -> True\n", i);
			}else {
				System.out.printf("%d -> False\n", i);
			}
			
		}
		
	}

}
