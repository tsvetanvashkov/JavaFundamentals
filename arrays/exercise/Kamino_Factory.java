package arrays.exercise;

import java.util.Scanner;

public class Kamino_Factory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sequenceLength = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		int sampleNumber = 0;
		int[] outputSequence = new int[sequenceLength];
		int outputOnesLength = 0;
		int outputIndex = sequenceLength;
		int outputSum = 0;
		int outputSampleNumber = 0;
		
		while ((input.equals("Clone them!")) != true) {
			sampleNumber++;
			String[] stringSequence = input.split("[!]+"); 
			int[] sequence = new int[sequenceLength];
			for (int i = 0; i < sequence.length; i++) {
				sequence[i] = Integer.parseInt(stringSequence[i]);
			}
			
			int startIndex = sequenceLength;
			int onesLength = 0;
			int count = 0;
			int sum = 0;
			
			for (int i = (sequenceLength - 1); i >= 0; i--) {
				if (sequence[i] == 1) {
					count++;
					sum++;
				}else {
					count = 0;
				}
				if (count >= onesLength) {
					onesLength = count;
					startIndex = i;
				}
		
			}
			
			if ((onesLength > outputOnesLength) || ((onesLength == outputOnesLength) && (startIndex < outputIndex)) || 
					((onesLength == outputOnesLength) && (startIndex == outputIndex) && (sum > outputSum))) {
				outputSampleNumber = sampleNumber;
				outputOnesLength = onesLength;
				outputIndex = startIndex;
				outputSum = sum;
				for (int i = 0; i < sequenceLength; i++) {
					outputSequence[i] = sequence[i];
				}
				
			}
			
			input= scan.nextLine();
		}
		scan.close();
		System.out.printf("Best DNA sample %d with sum: %d.\n", outputSampleNumber, outputSum);
		for (int i = 0; i < sequenceLength; i++) {
			System.out.printf("%d", outputSequence[i]);
			if (i < sequenceLength - 1) {
				System.out.print(" ");
			}
		}

	}

}
