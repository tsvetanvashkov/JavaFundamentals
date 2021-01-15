package data_types_and_variables.exercise;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int person = scan.nextInt();
		int capacity = scan.nextInt();
		scan.close();
		
		int couses = (int)(person / capacity);
		if ((person % capacity) != 0) {
			couses++;
		}
		
		System.out.println(couses);

	}

}
