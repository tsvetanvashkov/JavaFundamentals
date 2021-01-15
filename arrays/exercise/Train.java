package arrays.exercise;

import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int wagonNum = scan.nextInt();
		int[] peopleNum = new int[wagonNum]; 
		int sum = 0;
		
		for (int i = 0; i < peopleNum.length; i++) {
			peopleNum[i] = scan.nextInt();
			sum += peopleNum[i];
		}
		
		for (int i = 0; i < peopleNum.length; i++) {
			System.out.printf("%d ", peopleNum[i]);
		}
		
		System.out.printf("\n%d", sum);
		scan.close();

	}

}
