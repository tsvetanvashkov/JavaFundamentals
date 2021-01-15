package data_types_and_variables.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exact_Sum_of_Real_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigDecimal sum = new BigDecimal(0);
		
		for (int i = 0; i < n; i++) {
			BigDecimal number = scan.nextBigDecimal(); 
			sum = sum.add(number); 
		}
		
		System.out.println(sum);
		scan.close();
	}

}
