package arrays.exercise;

import java.util.Scanner;

public class Array_Rotation {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int num = scan.nextInt();
		scan.close();
		String[] output = new String[input.length];
		
		for (int i = 0; i < output.length; i++) {
			while (num >= input.length) {
				num -= input.length;
			}
			output[i] = input[num];
			num++;
		}
		
		System.out.println(String.join(" ", output));

	}

}
