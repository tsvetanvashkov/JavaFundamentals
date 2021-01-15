package data_types_and_variables.exercise;

import java.util.Scanner;

public class SnowBalls {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String output = "";
		long snowballValue = 0;
		
		for (int i = 0; i < number; i++) {
			int snowballSnow = scan.nextInt();
			int snowballTime = scan.nextInt();
			int snowballQuality = scan.nextInt();
			
			long value = 1;
			for (int j = 0; j < snowballQuality; j++) {
				value *= snowballSnow / snowballTime;

			}
			
			if (snowballValue <= value) {
				snowballValue = value;
				output = snowballSnow + " : " + snowballTime + " = " + snowballValue + " (" + snowballQuality + ")";
				
			}
			
		}
		
		if (number == 0) {
			System.out.println("0 : 1 = 0 (0)");
		}else {
			System.out.println(output);
			scan.close();
		}

	}

}
