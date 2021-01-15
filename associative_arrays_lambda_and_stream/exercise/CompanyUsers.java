package associative_arrays_lambda_and_stream.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, List<String>> companes = new TreeMap<String, List<String>>();
		String input = scan.nextLine();
		while (!input.equals("End")) {
			String[] inputArray = input.split(" -> ");
			String companyName = inputArray[0];
			String employeeID = inputArray[1];
			List<String> valueList = companes.get(companyName);
			if (valueList == null) {
				valueList = new ArrayList<String>();
				companes.put(companyName, valueList);
			}
			if (!valueList.contains(employeeID)) {
				valueList.add(employeeID);
			}
			input = scan.nextLine();
		}
		scan.close();
		companes.entrySet()
				.stream()
				.forEach(e -> {
					System.out.println(e.getKey());
					e.getValue().stream()
							.forEach(p -> System.out.printf("-- %s\n", p));
				});
			
	}

}
