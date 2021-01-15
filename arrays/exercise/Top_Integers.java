package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Top_Integers {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		scan.close();
		int[] output = new int[input.length];
		int bigger = Integer.MIN_VALUE;
		boolean change = false;
		int count = 0;
		
		for (int i = input.length - 1; i >= 0; i--) {
			if (input[i] > bigger) {
				bigger = input[i];
				change = true;
			}
			if (change) {
				output[count] = bigger;
				count++;
				change = false;
			}
			
		}
		
		for (int i = (count - 1); i >= 0; i--) {
			System.out.printf("%d ", output[i]);
		}

	}

}
