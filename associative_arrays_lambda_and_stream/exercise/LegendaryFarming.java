package associative_arrays_lambda_and_stream.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] legendaryItems = {"Shadowmourne", "Valanyr", "Dragonwrath"};
		Map<String, Integer> materials = new TreeMap<String, Integer>();
		Map<String, Integer> junk = new TreeMap<String, Integer>();
		materials.put("shards", 0);
		materials.put("fragments", 0);
		materials.put("motes", 0);
		boolean item = false;
		while (!item) {
			String[] input = scan.nextLine().split(" ");
			String[] inputMaterils = new String[input.length / 2];
			int[] inputValues = new int[input.length / 2];
			for (int i = 0; i < input.length; i++) {
				if ((i % 2) != 0) {
					inputMaterils[i / 2] = input[i].toLowerCase();
				}else {
					inputValues[i / 2] = Integer.parseInt(input[i]);
				}
			}
			for (int i = 0; i < inputMaterils.length; i++) {
				if (materials.containsKey(inputMaterils[i])) {
					Integer value = materials.get(inputMaterils[i]);
					value += inputValues[i];
					materials.put(inputMaterils[i], value);
					if (materials.get(inputMaterils[i]) >= 250) {
						item = true;
						materials.put(inputMaterils[i], materials.get(inputMaterils[i]) - 250);
						if (inputMaterils[i].equals("shards")) {
							System.out.printf("%s obtained!\n", legendaryItems[0]);
						}else if (inputMaterils[i].equals("fragments")) {
							System.out.printf("%s obtained!\n", legendaryItems[1]);
						}else if (inputMaterils[i].equals("motes")) {
							System.out.printf("%s obtained!\n", legendaryItems[2]);
						}
						break;
					}
				}else {
					Integer value = junk.get(inputMaterils[i]);
					if (value == null) {
						value = inputValues[i];
					}else {
						value += inputValues[i];
					}
					junk.put(inputMaterils[i], value);
				}
			}
		}
		scan.close();
		materials.entrySet().stream()
		.sorted((f,s) -> {
			int result = s.getValue().compareTo(f.getValue());
			if (result == 0) {
				result = f.getKey().compareTo(s.getKey());
			}
			return result;
		}).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
		junk.forEach((k,v) -> System.out.println(k + ": " + v));

	}

}
