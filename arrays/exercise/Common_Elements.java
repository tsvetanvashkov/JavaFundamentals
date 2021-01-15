package arrays.exercise;

import java.util.Scanner;

public class Common_Elements {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String[] firstInput = scan.nextLine().split(" ");
		String[] secondInput = scan.nextLine().split(" ");
		String[] output = new String[firstInput.length];
		int index = 0;
		scan.close();
		
		for (int i = 0; i < secondInput.length; i++) {
			for (int j = 0; j < firstInput.length; j++) {
				if (firstInput[j].equals(secondInput[i])) {
					output[index] = secondInput[i];
					index++;
				}
			}
		}
		
		for (int i = 0; i < index; i++) {
			System.out.printf(" %s", output[i]);
		}
	
	}

}
