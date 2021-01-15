package methods.exercise;

import java.util.Scanner;

public class NxN_Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		printMatrix(number);

	}

	private static void printMatrix(int number) {
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.printf("%d ", number);
			}
			System.out.println();
		}
		
	}

}
