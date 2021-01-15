package arrays.exercise;

import java.util.Scanner;

public class Zig_Zag_Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int[] firstArray = new int[num];
		int[] secondArray = new int[num];
		
		for (int i = 0; i < num; i++) {
			int[] input = {scan.nextInt(), scan.nextInt()};
			if ((i % 2) == 0) {
				firstArray[i] = input[0];
				secondArray[i] = input[1];
			}else {
				firstArray[i] = input[1];
				secondArray[i] = input[0];
			}
		}
		scan.close();
		
		for (int i = 0; i < firstArray.length; i++) {
			System.out.printf("%d ", firstArray[i]);
		}
		System.out.println();
		for (int i = 0; i < firstArray.length; i++) {
			System.out.printf("%d ", secondArray[i]);
		}

	}

}
