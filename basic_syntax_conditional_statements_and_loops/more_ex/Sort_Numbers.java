package basic_syntax_conditional_statements_and_loops.more_ex;

import java.util.Scanner;

public class Sort_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1);
				if (num2 > num3) {
					System.out.println(num2);
					System.out.println(num3);
				}else {
					System.out.println(num3);
					System.out.println(num2);
				}
			}else {
				System.out.println(num3);
				System.out.println(num1);
				System.out.println(num2);
			}
		}else {
			if (num2 > num3) {
				System.out.println(num2);
				if (num1 > num3) {
					System.out.println(num1);
					System.out.println(num3);
				}else {
					System.out.println(num3);
					System.out.println(num1);
				}
			}else {
				System.out.println(num3);
				System.out.println(num2);
				System.out.println(num1);
			}
		}

	}

}
