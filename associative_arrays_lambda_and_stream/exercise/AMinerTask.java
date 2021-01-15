package associative_arrays_lambda_and_stream.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Long> miner = new LinkedHashMap<String, Long>();
		String resource = scan.nextLine();
		while (!resource.equals("stop")) {
			long quantity = Long.parseLong(scan.nextLine());
			Long value = miner.get(resource);
			if (value == null) {
				value = quantity;
			}else {
				value += quantity; 
			}
			miner.put(resource, value);
			resource = scan.nextLine();
		}
		scan.close();
		for (Map.Entry<String, Long> entry: miner.entrySet()) {
			System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
		}

	}

}
