package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> sequance = new ArrayList<String>();
		sequance = getValue(scan);
		sequance = recivingCommands(sequance, scan);
		printing(sequance);

	}

	private static void printing(List<String> sequance) {
		String output = "";
		for (int i = 0; i < sequance.size(); i++) {
			output += sequance.get(i);
			if (i < (sequance.size() - 1)) {
				output += " ";
			}
		}
		System.out.println(output);
		
	}

	private static List<String> recivingCommands(List<String> sequance, Scanner scan) {
		String command = scan.nextLine();
		while (command.equals("3:1") != true) {
			String[] commandArray = command.split(" ");
			switch (commandArray[0]) {
			case "merge":
				sequance = getMarge(sequance, Integer.parseInt(commandArray[1]), Integer.parseInt(commandArray[2]));
				break;
			case "divide":
				sequance = getDivide(sequance, Integer.parseInt(commandArray[1]), Integer.parseInt(commandArray[2]));
			}
			
			command = scan.nextLine();
		}
		return sequance;
	}

	private static List<String> getDivide(List<String> sequance, int index, int partitions) {
		if ((index >= 0) && (index < sequance.size())) {
			String elements = sequance.get(index);
			sequance.remove(index);
			int divide = elements.length() / partitions;
			for (int i = partitions; i > 0; i--) {
				String dividePartition = ""; 
				if ((elements.length() % partitions) != 0 && i == partitions) {
					dividePartition = elements.substring(((i - 1) * divide), elements.length());
				}else {
					dividePartition = elements.substring(((i - 1) * divide), (i * divide));
				}
				sequance.add(index, dividePartition);
			}
			
		}
		
		return sequance;
	}

	private static List<String> getMarge(List<String> sequance, int startIndex, int endIndex) {
		if (startIndex < 0) {
			startIndex = 0;
		}else if (startIndex >= sequance.size()) {
			return sequance;
		}
		if (endIndex >= sequance.size()) {
			endIndex = (sequance.size() - 1);
		}else if (endIndex < 0) {
			return sequance;
		}
		for (int i = startIndex; i < endIndex; i++) {
			sequance.set((startIndex), (sequance.get(startIndex) + sequance.get(startIndex + 1)));
			sequance.remove(startIndex + 1);
		}
		return sequance;
	}

	private static List<String> getValue(Scanner scan) {
		String[] input = scan.nextLine().split(" ");
		List<String> output = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			output.add(input[i]);
		}
		return output;
	}

}
