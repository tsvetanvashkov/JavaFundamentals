package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Padawan_Equipment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double money = Double.parseDouble(scan.nextLine());
		int students = Integer.parseInt(scan.nextLine());
		double priceLightsabers = Double.parseDouble(scan.nextLine());
		double priceRobes = Double.parseDouble(scan.nextLine());
		double priceBelts =Double.parseDouble(scan.nextLine());
		scan.close();
		
		double lightsabers = Math.ceil(students *(1 + 0.1)) * priceLightsabers ;
		double robes = students * priceRobes;
		double belts = (students - Math.floor(students / 6)) * priceBelts;
		
		double sum = lightsabers + robes + belts;
		
		if (money >= sum) {
			System.out.printf("The money is enough - it would cost %.2flv.", sum);
		}else {
			System.out.printf("Ivan Cho will need %.2flv more.", (sum - money));
		}

	}

}
