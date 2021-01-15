package data_types_and_variables.lab;

import java.util.Scanner;

public class Chars_to_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String leter1 = scan.nextLine();
		String leter2 = scan.nextLine();
		String leter3 = scan.nextLine();
		scan.close();
		
		String output = "" + leter1.charAt(0) + leter2.charAt(0) + leter3.charAt(0);
		
		System.out.println(output);

	}

}
