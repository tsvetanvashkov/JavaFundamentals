package associative_arrays_lambda_and_stream.exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Courses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, List<String>> courses = new LinkedHashMap<String, List<String>>();
		String input = scan.nextLine();
		while (!input.equals("end")) {
			String[] inputArray = input.split(" : ");
			String courseName = inputArray[0];
			String studentName = inputArray[1];
			List<String> valueList = courses.get(courseName);
			if (valueList == null) {
				valueList = new ArrayList<String>();
				courses.put(courseName, valueList);
			}
			valueList.add(studentName);
			input = scan.nextLine();
		}
		scan.close();
		courses.entrySet()
			.stream()
			.sorted((f, s) -> s.getValue().size() - f.getValue().size())
			.forEach(e -> {
				System.out.printf("%s: %d\n", e.getKey(), e.getValue().size());
				e.getValue()
					.stream()
					.sorted((f, s) -> f.compareTo(s))
					.forEach(p -> System.out.printf("-- %s\n", p));
					
			});
		
	}

}
