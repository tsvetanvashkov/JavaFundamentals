package data_types_and_variables.exercise;

import java.util.Scanner;

public class Beer_Kegs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		double volumeBiggest = 0;
		String biggest = "";
		
		for (int i = 0; i < number; i++) {
			String  model = scan.nextLine();
			double radius = Double.parseDouble(scan.nextLine());
			int height = Integer.parseInt(scan.nextLine());;
			
			double volume = Math.PI * (radius * radius) * height;
			if (volumeBiggest < volume) {
				volumeBiggest = volume;
				biggest = model;
			}
			
		}
		
		System.out.println(biggest);
		scan.close();

	}

}
