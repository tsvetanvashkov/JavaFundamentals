package lists.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> listNumbers = new ArrayList<Integer>();
		listNumbers = getnumbers(scan);
		String manipulation = scan.nextLine();
		while ((manipulation.equals("end")) != true) {
			manipulations(listNumbers, manipulation);
			manipulation = scan.nextLine();
		}
	}
	
	private static void manipulations(List<Integer> listNumbers, String manipulation) {
		String[] command = manipulation.split(" ");
		switch (command[0]) {
		case "Contains":
			containsNumber(listNumbers, Integer.parseInt(command[1]));
			break;
		case "Print":
			if (command[1].equals("even")) {
				printEven(listNumbers, " ");
			}else if (command[1].equals("odd")) {
				printOdd(listNumbers, " ");
			}
			break;
		case "Get":
			if (command[1].equals("sum")) {
				printSum(listNumbers);
			}
			break;
		case "Filter":
			printFilter(listNumbers, command[1], Integer.parseInt(command[2]), " ");
			break;
		}

	}

	private static void printFilter(List<Integer> listNumbers, String condition, int number, String delimiter) {
		String output = "";
		switch (condition) {
		case "<":
			for (Integer index : listNumbers) {
				if (index < number) {
					output += index + delimiter;
				}
			}
			break;
		case ">":
			for (Integer index : listNumbers) {
				if (index > number) {
					output += index + delimiter;
				}
			}
			break;
		case "<=":
			for (Integer index : listNumbers) {
				if (index <= number) {
					output += index + delimiter;
				}
			}
			break;
		case ">=":
			for (Integer index : listNumbers) {
				if (index >= number) {
					output += index + delimiter;
				}
			}
			break;
		}
		System.out.println(output);
		
	}

	private static void printSum(List<Integer> listNumbers) {
		int sum = 0;
		for (Integer index : listNumbers) {
			sum += index;
		}
		System.out.println(sum);
	}

	private static void printOdd(List<Integer> listNumbers, String delimiter) {
		String output = "";
		for (Integer index : listNumbers) {
			if ((index % 2) != 0) {
				output += index + delimiter;
			}
		}
		System.out.println(output);
		
	}

	private static void printEven(List<Integer> listNumbers, String delimiter) {
		String output = "";
		for (Integer index : listNumbers) {
			if ((index % 2) == 0) {
				output += index + delimiter;
			}
		}
		System.out.println(output);
	}

	private static void containsNumber(List<Integer> listNumbers, int number) {
		if (listNumbers.contains(number)) {
			System.out.println("Yes");
		}else {
			System.out.println("No such number");
		}
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
