package data_types_and_variables.lab;

import java.util.Scanner;

public class Reversed_Chars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String leter1 = scan.nextLine();
		String leter2 = scan.nextLine();
		String leter3 = scan.nextLine();
		scan.close();
		
		String output = leter3.charAt(0) + " " + leter2.charAt(0) + " " + leter1.charAt(0);
		
		System.out.println(output);

	}

}
