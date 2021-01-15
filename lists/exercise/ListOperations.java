package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		List<Integer> numers = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			numers.add(Integer.parseInt(input[i]));
		}
		String command = scan.nextLine();
		while (command.equals("End") != true) {
			String[] commandArray = command.split(" ");
			switch (commandArray[0]) {
			case "Add":
				numers = addToList(numers, Integer.parseInt(commandArray[1]));
				break;
			case "Insert":
				numers = insertInList(numers, Integer.parseInt(commandArray[1]), Integer.parseInt(commandArray[2]));
				break;
			case "Remove":
				numers = removeIndexFromList(numers, Integer.parseInt(commandArray[1]));
				break;
			case "Shift":
				if (commandArray[1].equals("left")) {
					numers = shiftListToLeft(numers, Integer.parseInt(commandArray[2]));
				}else if (commandArray[1].equals("right")) {
					numers = shiftListToRight(numers, Integer.parseInt(commandArray[2]));
				}
				break;
				
			}
			
			command = scan.nextLine();
		}
		printing(numers);
		
		scan.close();

	}

	private static List<Integer> shiftListToRight(List<Integer> numers, int count) {
		while (count > 0) {
			numers.add(0, numers.get(numers.size() - 1));
			numers.remove(numers.size() - 1);
			count--;
		}
		return numers;
	}

	private static List<Integer> shiftListToLeft(List<Integer> numers, int count) {
		while (count > 0) {
			numers.add(numers.get(0));
			numers.remove(0);
			count--;
		}
		return numers;
	}

	private static List<Integer> removeIndexFromList(List<Integer> numers, int index) {
		if ((index >= 0) && (index < numers.size())) {
			numers.remove(index);
		}else {
			System.out.println("Invalid index");
		}
		return numers;
	}

	private static List<Integer> insertInList(List<Integer> numers, int element, int index) {
		if ((index >= 0) && (index < numers.size())) {
			numers.add(index, element);
		}else {
			System.out.println("Invalid index");
		}
		return numers;
	}

	private static List<Integer> addToList(List<Integer> numers, int element) {
		numers.add(element);
		return numers;
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

}
