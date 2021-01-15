package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		List<Integer> sequence =new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			sequence.add(Integer.parseInt(input[i]));
		}
		String[] specialAndPower = scan.nextLine().split(" ");
		scan.close();
		int numberBomb = Integer.parseInt(specialAndPower[0]);
		int numberPower = Integer.parseInt(specialAndPower[1]);
		sequence = detonation(sequence, numberBomb, numberPower);
		printSumOfSequence(sequence);

	}

	private static void printSumOfSequence(List<Integer> sequence) {
		int sum = 0;
		for (int i = 0; i < sequence.size(); i++) {
			sum += sequence.get(i);
		}
		System.out.println(sum);
		
	}

	private static List<Integer> detonation(List<Integer> sequence, int numberBomb, int numberPower) {
		for (int i = 0; i < sequence.size(); i++) {
			if (sequence.get(i) == numberBomb) {
				int startIndexExplosion = i - numberPower;
				int endIndexExplosion = i + numberPower;
				if (startIndexExplosion < 0) {
					startIndexExplosion = 0;
				}
				if (endIndexExplosion >= sequence.size()) {
					endIndexExplosion = (sequence.size() - 1);
				}
				for (int j = startIndexExplosion; j <= endIndexExplosion; j++) {
					sequence.remove(startIndexExplosion);
				}
				i = (startIndexExplosion - 1);
			}
		}
		return sequence;
	}

}
