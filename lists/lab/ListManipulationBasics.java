package lists.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> listNumbers = new ArrayList<Integer>();
		listNumbers = getnumbers(scan);
		String manipulation = scan.nextLine();
		while ((manipulation.equals("end")) != true) {
			listNumbers = manipulations(listNumbers, manipulation);
			manipulation = scan.nextLine();
		}
		printListNumbers(listNumbers, " ");

	}



	private static void printListNumbers(List<Integer> listNumbers, String delimiter) {
		String output = "";
		for (int i = 0; i < listNumbers.size(); i++) {
			output += listNumbers.get(i);
			if (i < (listNumbers.size() -1)) {
				output += delimiter;
			}
		}
		System.out.println(output);
	}



	private static List<Integer> manipulations(List<Integer> listNumbers, String manipulation) {
		String[] command = manipulation.split(" ");
		List<Integer> output = new ArrayList<Integer>();
		switch (command[0]) {
		case "Add":
			output = addToList(listNumbers, Integer.parseInt(command[1]));
			break;
		case "Remove":
			output = removeFromList(listNumbers, Integer.parseInt(command[1]));
			break;
		case "RemoveAt":
			output = removeAtList(listNumbers, Integer.parseInt(command[1]));
			break;
		case "Insert":
			output = InsetToList(listNumbers, Integer.parseInt(command[2]), Integer.parseInt(command[1]));
			break;
		}
		return output;
	}



	private static List<Integer> InsetToList(List<Integer> listNumbers, int insetIndex, int insertNumber) {
		listNumbers.add(insetIndex, insertNumber);;
		return listNumbers;
	}



	private static List<Integer> removeAtList(List<Integer> listNumbers, int removeIndex) {
		listNumbers.remove(removeIndex);
		return listNumbers;
	}



	private static List<Integer> removeFromList(List<Integer> listNumbers, int removeNumber) {
		listNumbers.remove(Integer.valueOf(removeNumber));
		return listNumbers;
	}



	private static List<Integer> addToList(List<Integer> listNumbers, int addNumber) {
		listNumbers.add(addNumber);
		return listNumbers;
	}



	private static List<Integer> getnumbers(Scanner scan) {
		List<Integer> output = new ArrayList<Integer>();
		String[] input = scan.nextLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			output.add(Integer.parseInt(input[i]));
		}
		return output;
	}

}
