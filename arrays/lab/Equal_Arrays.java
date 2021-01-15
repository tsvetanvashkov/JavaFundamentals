package arrays.lab;

import java.util.Scanner;

public class Equal_Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] firstInput = scan.nextLine().split(" ");
		int[] firstArrey = new int[firstInput.length];
		for (int i = 0; i < firstInput.length; i++) {
			firstArrey[i] = Integer.parseInt(firstInput[i]);
		}
		
		String[] secondInput = scan.nextLine().split(" ");
		int[] secondArrey = new int[secondInput.length];
		for (int i = 0; i < secondInput.length; i++) {
			secondArrey[i] = Integer.parseInt(secondInput[i]);
		}
		
		scan.close();
		
		int sum = 0;
		boolean indentical = true;
		int index = 0;
		for (int i = 0; i < firstArrey.length; i++) {
			if (firstArrey[i] == secondArrey[i]) {
				sum += firstArrey[i];
			}else {
				indentical = false;
				index = i;
				break;
			}
		}
		
		if (indentical) {
			System.out.printf("Arrays are identical. Sum: %d", sum);
		}else {
			System.out.printf("Arrays are not identical. Found difference at %d index.", index);
		}

	}

}
