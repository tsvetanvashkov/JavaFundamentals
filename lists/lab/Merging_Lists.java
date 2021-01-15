package lists.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merging_Lists {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Double> numbersFirst = new ArrayList<Double>();
		numbersFirst = getNumbers(scan);
		List<Double> numbersSecond = new ArrayList<Double>();
		numbersSecond = getNumbers(scan);
		List<Double> mergingList = getMergingList(numbersFirst, numbersSecond);
		printingList(mergingList, " ");
		
	}

	private static void printingList(List<Double> mergingList, String delimiter) {
		String output = "";
		for (Double index : mergingList) {
			output += (new DecimalFormat("0.#").format(index) + delimiter);
		}
		System.out.println(output);
		
	}

	private static List<Double> getMergingList(List<Double> numbersFirst, List<Double> numbersSecond) {
		List<Double> outputMergingList = new ArrayList<Double>();
		int smalest = 0;
		if (numbersFirst.size() < numbersSecond.size()) {
			smalest = numbersFirst.size();
		}else {
			smalest = numbersSecond.size();
		}
		for (int i = 0; i < smalest; i++) {
			outputMergingList.add(numbersFirst.get(i));
			outputMergingList.add(numbersSecond.get(i));
			if (numbersFirst.size() == (i + 1)) {
				for (int j = (i + 1); j < numbersSecond.size(); j++) {
					outputMergingList.add(numbersSecond.get(j));
				}
			}
			if (numbersSecond.size() == (i + 1)) {
				for (int j = (i + 1); j < numbersFirst.size(); j++) {
					outputMergingList.add(numbersFirst.get(j));
				}
			}
		}
		return outputMergingList;
	}

	private static List<Double> getNumbers(Scanner scan) {
		List<Double> output = new ArrayList<Double>();
		String[] input = scan.nextLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			output.add(Double.parseDouble(input[i]));
		}

		return output;
	}

}
