package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonDoNotGo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> sequance = new ArrayList<Integer>();
		sequance = getValue(scan);
		int sum = getPokemon(sequance, scan);
		System.out.println(sum);

	}

	private static int getPokemon(List<Integer> sequance, Scanner scan) {
		int sum = 0;		
		while (!sequance.isEmpty()) {
			int index = scan.nextInt();
			if (index < 0) {
				index = 0;
				sequance.add((index + 1), sequance.get(sequance.size() - 1));
			}else if (index > (sequance.size() - 1)) {
				index = sequance.size() - 1;
				sequance.add((index + 1), sequance.get(0));
			}
			int element = sequance.get(index);
			sum += element;
			sequance.remove(index);
			for (int i = 0; i < sequance.size(); i++) {
				if (sequance.get(i) <= element) {
					sequance.set(i, (sequance.get(i) + element));
				}else {
					sequance.set(i, (sequance.get(i) - element));
				}
			}

			
		}
		return sum;
	}

	private static List<Integer> getValue(Scanner scan) {
		String[] input = scan.nextLine().split(" ");
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			output.add(Integer.parseInt(input[i]));
		}
		return output;
	}

}
