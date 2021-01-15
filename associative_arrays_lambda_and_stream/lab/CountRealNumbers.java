package associative_arrays_lambda_and_stream.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		scan.close();
		Map<Double, Integer> count = new TreeMap<Double, Integer>();
		for (double num : nums) {
			Integer counter = count.get(num); 
			if (counter == null) {
				counter = 0;
			}
			count.put(num, counter + 1);
		}
		
		for (Map.Entry<Double, Integer> entry : count.entrySet()) {
			DecimalFormat df = new DecimalFormat("#.#####");
			System.out.printf("%s -> %d\n", df.format(entry.getKey()), entry.getValue());
		}

	}

}
