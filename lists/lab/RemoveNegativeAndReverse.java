package lists.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativeAndReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numberts = new ArrayList<Integer>();
		numberts = getInputs(scan);
		numberts = removeNegativeAndReverse(numberts);
		print(numberts, " ");

	}

	private static void print(List<Integer> numberts, String delimiter) {
		if (numberts.isEmpty()) {
			System.out.println("empty");
		}else {
			for (int i = 0; i < numberts.size(); i++) {
				System.out.print(numberts.get(i));
				if (i < (numberts.size() -1)) {
					System.out.print(delimiter);
				}
			}
		}
		
	}

	private static List<Integer> removeNegativeAndReverse(List<Integer> numberts) {
		List<Integer> output = new ArrayList<Integer>();
		for (int i = (numberts.size() - 1); i >= 0; i--) {
			if (numberts.get(i) < 0) {
				continue;
			}
			output.add(numberts.get(i));
		}
		return output;
	}

	private static List<Integer> getInputs(Scanner scan) {
		String[] input = scan.nextLine().split(" ");
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			output.add(Integer.parseInt(input[i]));
		}
		return output;
	}

}
