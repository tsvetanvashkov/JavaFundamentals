package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Sums {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		scan.close();
		
		String output = "";
		
		for (int i = 0; i < input.length; i++) {
			int sumR = 0;
			int sumL = 0;
			for (int j = 0; j < i; j++) {
				sumL += input[j];
			}
			for (int j = (i + 1); j < input.length; j++) {
				sumR += input[j];
			}
			if (sumL == sumR) {
				output = "" + i;
				break;
			}else {
				output = "no";
			}
		}
		
		System.out.println(output);

	}

}
