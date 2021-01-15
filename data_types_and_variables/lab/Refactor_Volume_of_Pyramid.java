package data_types_and_variables.lab;

import java.util.Scanner;

public class Refactor_Volume_of_Pyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Length: ");
		double length = Double.parseDouble(scanner.nextLine());
		System.out.print("Width: ");
		double wedth = Double.parseDouble(scanner.nextLine());
		System.out.print("Height: ");
		double heigth = Double.parseDouble(scanner.nextLine());
		double Volume = (length * wedth * heigth) / 3;
		System.out.printf("Pyramid Volume: %.2f", Volume);
		scanner.close();

	}

}
