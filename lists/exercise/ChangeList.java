package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		List<Integer> numers = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			numers.add(Integer.parseInt(input[i]));
		}
		String command = scan.nextLine();
		while (command.equals("end") != true) {
			String[] commandArray = command.split(" ");
			switch (commandArray[0]) {
			case "Delete":
				numers = deleteFromList(numers, Integer.parseInt(commandArray[1]));
				break;
			case "Insert":
				numers = insertInList(numers, Integer.parseInt(commandArray[1]), Integer.parseInt(commandArray[2]));
				break;
			}
			
			command = scan.nextLine();
		}
		printing(numers);
		
		scan.close();

	}

	private static void printing(List<Integer> numers) {
		String output = "";
		for (int i = 0; i < numers.size(); i++) {
			output += numers.get(i);
			if (i < (numers.size() - 1)) {
				output += " ";
			}
		}
		System.out.println(output);
	}

	private static List<Integer> insertInList(List<Integer> numers, int element, int index) {
		if ((index >= 0) && (index < numers.size())) {
			numers.add(index, element);
		}

		return numers;
	}

	private static List<Integer> deleteFromList(List<Integer> numers, int element) {
		//while (numers.contains(element)) {
			numers.remove(Integer.valueOf(element));
		//}
		return numers;
	}

}
