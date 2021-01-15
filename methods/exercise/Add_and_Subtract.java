package methods.exercise;

import java.util.Scanner;

public class Add_and_Subtract {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		scan.close();
		
		int sum = getSum(first, second);
		int output = getSubtract(sum, third);
		
		System.out.println(output);
		
	}

	private static int getSubtract(int sum, int third) {
		int subtract = sum - third;
		return subtract;
	}

	private static int getSum(int first, int second) {
		int sum = first + second;
		return sum;
	}

}
