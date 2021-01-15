package lists.exercise;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String train = scan.nextLine();
		int capacity = Integer.parseInt(scan.nextLine());
		String output = addPassengers(train, capacity, scan);
		System.out.println(output);

	}

	private static String addPassengers(String train, int capacity, Scanner scan) {
		List<Integer> wagons = new ArrayList<Integer>();
		String[] trainWagons = train.split(" ");
		for (int i = 0; i < trainWagons.length; i++) {
			wagons.add(Integer.parseInt(trainWagons[i]));
		}
		String input = scan.nextLine();
		while (input.equals("end") != true) {
			String[] array =  input.split(" ");
			if (array[0].equals("Add")) {
				wagons.add(Integer.parseInt(array[1]));
			}else {
				int passengers = Integer.parseInt(array[0]);
				for (int i = 0; i < wagons.size(); i++) {
					if (wagons.get(i) == capacity) {
						continue;
					}else {
						int sum = wagons.get(i) + passengers;
						if (sum <= capacity) {
							wagons.set(i, sum);
							break;
						}
					}
				}
			}
			
			input = scan.nextLine();
		}
		
		String output = getString(wagons, " ");
		return output;
		
	}
	
	private static String getString(List<Integer> wagonList, String delimiter) {
		String output = "";
		for (Integer index : wagonList) {
			output += (new DecimalFormat("0.#").format(index) + delimiter);
		}
		return output;
	}

}
