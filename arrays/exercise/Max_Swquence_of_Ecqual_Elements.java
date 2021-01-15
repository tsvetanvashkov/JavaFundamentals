package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Swquence_of_Ecqual_Elements {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		scan.close();
		int count = 1;
		int element = input[0];
		int[] output = new int[0];
		
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] == input[i + 1]) {
				count++;
				element = input[i];
			}else {
				count = 1;
			}
			if (output.length < count ) {
				output = new int[count];
				for (int j = 0; j < output.length; j++) {
					output[j] = element;
				}
			}
		}
		
		for (int i = 0; i < output.length; i++) {
			System.out.printf("%d ", output[i]);
		}

	}

}
