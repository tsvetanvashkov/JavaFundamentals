package associative_arrays_lambda_and_stream.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoftUniExamResults {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> softUni = new HashMap<String, Integer>();
		Map<String, Integer> exam = new TreeMap<String, Integer>(); 
		String input = scan.nextLine();
		while (!input.equals("exam finished")) {
			String inputArray[] = input.split("-");
			String username = inputArray[0];
			String language = inputArray[1];
			if (language.equals("banned")) {
				softUni.remove(username);
				input = scan.nextLine();
				continue;
			}
			Integer points = Integer.parseInt(inputArray[2]);
			Integer maxPoints = softUni.get(username);
			if (maxPoints == null) {
				maxPoints = 0;
			}
			if (points >= maxPoints) {
				maxPoints = points;
				softUni.put(username, maxPoints);
			}
			Integer count = exam.get(language);
			if (count == null) {
				count = 0;
			}
			count++;
			exam.put(language, count);
			
			
			input = scan.nextLine();
		}
		scan.close();
		System.out.println("Results:");
		softUni.entrySet().stream()
				.sorted((f,s) -> {
					int result = s.getValue().compareTo(f.getValue());
					if (result == 0) {
						result = f.getKey().compareTo(s.getKey());
					}
					return result;
				}).forEach(e -> {
					System.out.printf("%s | %d\n", e.getKey(), e.getValue());
				});
		System.out.println("Submissions:");
		exam.entrySet().stream()
				.forEach(e -> {
					System.out.printf("%s - %d\n", e.getKey(), e.getValue());
				});
		

	}

}
