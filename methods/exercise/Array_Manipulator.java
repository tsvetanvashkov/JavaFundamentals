package methods.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Manipulator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = getArrayInt(scan.nextLine());
		String input = scan.nextLine();
		
		while (input.equals("end") != true) {
			String[] comand = input.split(" ");
			
			switch (comand[0]) {
			case "exchange":
				int indexExchange = Integer.parseInt(comand[1]);
				if (indexExchange >= array.length || indexExchange < 0) {
					System.out.println("Invalid index");
				}else {
					array = getExchange(array, indexExchange);
				}
				break;
			case "max":
				int maxIndex = -1;
				if (comand[1].equals("even")) {
					maxIndex = getMaxEvenIndex(array);
				}else if (comand[1].equals("odd")) {
					maxIndex = getMaxOddIndex(array);
				}
				if (maxIndex >= 0) {
					System.out.println(maxIndex);
				}else {
					System.out.println("No matches");
				}
				break;
			case "min":
				int minIndex = -1;
				if (comand[1].equals("even")) {
					minIndex = getMinEvenIndex(array);
				}else if (comand[1].equals("odd")) {
					minIndex = getMinOddIndex(array);
				}
				if (minIndex >= 0) {
					System.out.println(minIndex);
				}else {
					System.out.println("No matches");
				}
				break;
			case "first":
				int countFirstElements = Integer.parseInt(comand[1]);
				if (countFirstElements <= array.length) {
					int[] firstElements = new int[countFirstElements];
					if (comand[2].equals("even")) {
						firstElements = getFirstEvenElements(countFirstElements, array);
					}else if (comand[2].equals("odd")) {
						firstElements = getFirstOddElements(countFirstElements, array);
					}
					System.out.println(Arrays.toString(firstElements));
				}else {
					System.out.println("Invalid count");
				}
				break;
			case "last":
				int countLastElements = Integer.parseInt(comand[1]);
				if (countLastElements <= array.length) {
					int[] lastElements = new int[countLastElements];
					if (comand[2].equals("even")) {
						lastElements = getLastEvenElements(countLastElements, array);
					}else if (comand[2].equals("odd")) {
						lastElements = getLastOddElements(countLastElements, array);
					}
					System.out.println(Arrays.toString(lastElements));
				}else {
					System.out.println("Invalid count");
				}
				break;
			}

			input = scan.nextLine();
			
		}
		System.out.println(Arrays.toString(array));
		scan.close();

	}

	private static int[] getArrayInt(String nextLine) {
		String[] input = nextLine.split(" ");
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i] = Integer.parseInt(input[i]);
		}
		return output;
	}

	private static int[] getLastOddElements(int countElements, int[] array) {
		int[] lastOddElements = new int[countElements];
		int count = 0;
		for (int i = (array.length - 1); i >= 0; i--) {
			if ((array[i] % 2) != 0) {
				lastOddElements[count] = array[i];
				count++;
				if (count == lastOddElements.length) {
					break;
				}
			}
		}
		if (count < countElements) {
			int[] output = new int[count];
			for (int i = 0; i < output.length; i++) {
				output[i] = lastOddElements[i];
			}
			output = reversArray(output);
			return output;
		}else {
			lastOddElements = reversArray(lastOddElements);
			return lastOddElements;
		}
	}

	private static int[] getLastEvenElements(int countElements, int[] array) {
		int[] lastEvenElements = new int[countElements];
		int count = 0;
		for (int i = (array.length - 1); i >= 0; i--) {
			if ((array[i] % 2) == 0) {
				lastEvenElements[count] = array[i];
				count++;
				if (count == lastEvenElements.length) {
					break;
				}
			}
		}
		if (count < countElements) {
			int[] output = new int[count];
			for (int i = 0; i < output.length; i++) {
				output[i] = lastEvenElements[i];
			}
			output = reversArray(output);
			return output;
		}else {
			lastEvenElements = reversArray(lastEvenElements);
			return lastEvenElements;
		}
	}

	private static int[] reversArray(int[] array) {
		int[] output = new int[array.length];
		for (int i = 0, j = (array.length - 1); i < array.length; i++, j--) {
			output[i] = array[j];
		}
		return output;
	}

	private static int[] getFirstOddElements(int countElements, int[] array) {
		int[] firstOddElements = new int[countElements];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2) != 0) {
				firstOddElements[count] = array[i];
				count++;
				if (count == firstOddElements.length) {
					break;
				}
			}
		}
		if (count < countElements) {
			int[] output = new int[count];
			for (int i = 0; i < output.length; i++) {
				output[i] = firstOddElements[i];
			}
			return output;
		}else {
			return firstOddElements;
		}
		
	}

	private static int[] getFirstEvenElements(int countElements, int[] array) {
		int[] firstEvenElements = new int[countElements];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2) == 0) {
				firstEvenElements[count] = array[i];
				count++;
				if (count == firstEvenElements.length) {
					break;
				}
			}
		}
		if (count < countElements) {
			int[] output = new int[count];
			for (int i = 0; i < output.length; i++) {
				output[i] = firstEvenElements[i];
			}
			return output;
		}else {
			return firstEvenElements;
		}
	}

	private static int getMinOddIndex(int[] array) {
		int minOddIndex = -1;
		int minOdd = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2) != 0) {
				if (array[i] <= minOdd) {
					minOdd = array[i];
					minOddIndex = i;
				}
			}
		}
		return minOddIndex;
	}

	private static int getMinEvenIndex(int[] array) {
		int minEvenIndex = -1;
		int minEven = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2) == 0) {
				if (array[i] <= minEven) {
					minEven = array[i];
					minEvenIndex = i;
				}
			}
		}
		return minEvenIndex;
	}

	private static int getMaxOddIndex(int[] array) {
		int maxOddIndex = -1;
		int maxOdd = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2) != 0) {
				if (array[i] >= maxOdd) {
					maxOdd = array[i];
					maxOddIndex = i;
				}
			}
		}
		return maxOddIndex;
	}

	private static int getMaxEvenIndex(int[] array) {
		int maxEvenIndex = -1;
		int maxEven = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2) == 0) {
				if (array[i] >= maxEven) {
					maxEven = array[i];
					maxEvenIndex = i;
				}
			}
		}
		return maxEvenIndex;
	}

	private static int[] getExchange(int[] array, int indexExchange) {
		int [] exchangeArray = new int[array.length];
		indexExchange++;
		if (indexExchange == array.length) {
			return array;
		}else {
			for (int i = 0; i < array.length; i++) {
				exchangeArray [i] = array[indexExchange];
				indexExchange++;
				if (indexExchange == array.length) {
					indexExchange = 0;
				}
			}
		return exchangeArray;
		}
		
	}

}
