package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Magic_Sum {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int number = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < input.length; i++) {
			for (int j = (i + 1); j < input.length; j++) {
				int sum = input[i] + input[j];
				if (number == sum) {
					System.out.printf("%d %d\n", input[i], input[j]);
				}
			}
		}

	}

}
