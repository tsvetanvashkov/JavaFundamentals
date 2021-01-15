package data_types_and_variables.exercise;

import java.util.Scanner;

public class Integer_Operations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		int fourth = scan.nextInt();
		scan.close();
		
		int output = ((first + second) / third) * fourth;
		
		System.out.println(output);
		
	}

}
