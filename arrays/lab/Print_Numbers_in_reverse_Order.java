package arrays.lab;

import java.util.Scanner;

public class Print_Numbers_in_reverse_Order {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] numbers = new int[num];
		
		for (int i = 0; i < num; i++) {
			numbers[i] = scan.nextInt();
		}
		
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.printf("%d ", numbers[i]);
		}
		scan.close();

	}

}
