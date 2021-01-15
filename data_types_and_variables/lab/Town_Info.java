package data_types_and_variables.lab;

import java.util.Scanner;

public class Town_Info {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String town = scan.nextLine();
		int population = scan.nextInt();
		int area = scan.nextInt();
		scan.close();
		
		System.out.printf("Town %s has population of %d and area %d square km.", town, population, area);

	}

}
