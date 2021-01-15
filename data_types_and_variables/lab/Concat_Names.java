package data_types_and_variables.lab;

import java.util.Scanner;

public class Concat_Names {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		String delimiter = scan.nextLine();
		scan.close();
		
		System.out.println(name1 + delimiter + name2);
		
	}

}
