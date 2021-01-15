package data_types_and_variables.exercise;

import java.util.Scanner;

public class Print_Part_of_the_ASCII_Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		scan.close();
		String outpit = "";
		
		for (int i = start; i <= end; i++) {
			
			outpit += (char)i + " ";
		}
		
		System.out.println(outpit);

	}

}
