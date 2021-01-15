package methods.exercise;

import java.util.Scanner;

public class Smallest_of_Three_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		scan.close();
		int smallest = getSmallestOfThree(first, second, third);
		System.out.println(smallest);

	}

	private static int getSmallestOfThree(int first, int second, int third) {
		int smallest = first;
		if (smallest > second) {
			smallest = second;
		}
		if (smallest > third) {
			smallest = third;
		}
		return smallest;
	}

}
