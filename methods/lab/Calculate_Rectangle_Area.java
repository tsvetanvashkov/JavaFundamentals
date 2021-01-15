package methods.lab;

import java.util.Scanner;

public class Calculate_Rectangle_Area {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double wight = Double.parseDouble(scan.nextLine());
		double length = Double.parseDouble(scan.nextLine());
		scan.close();
		double area = rectangleArea(wight, length);
		System.out.printf("%.0f", area);

	}

	private static double rectangleArea(double wight, double length) {
		double area = wight * length;
		return area;
	}

}
