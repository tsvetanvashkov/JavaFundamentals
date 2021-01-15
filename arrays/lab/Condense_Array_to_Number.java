package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Condense_Array_to_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] condensed = new int[num.length - 1];
		scan.close();
		
		while (condensed.length > 0) {
			for (int i = 0; i < condensed.length; i++) {
				condensed[i] = num[i] + num[i + 1];
				num[i] = condensed[i];
			}
			condensed = new int[condensed.length - 1];
			
		}
		
		System.out.println(num[0]);

	}

}
