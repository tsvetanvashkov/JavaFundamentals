package data_types_and_variables.exercise;

import java.util.Scanner;

public class Water_Overflow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int totalLiters = 0;
		int tank = 255;
		
		for (int i = 0; i < number; i++) {
			int liters = scan.nextInt();
			if ((liters > tank) || ((totalLiters + liters) > tank)) {
				System.out.println("Insufficient capacity!");
			}else {
				totalLiters += liters;
			}
			
		}
		
		System.out.println(totalLiters);
		scan.close();

	}

}
