package associative_arrays_lambda_and_stream.exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		Map<String, List<Double>> academy = new LinkedHashMap<String, List<Double>>();
		while (num > 0) {
			String name = scan.nextLine();
			double grade = Double.parseDouble(scan.nextLine());
			List<Double> volue = academy.get(name);
			if (volue == null) {
				volue = new ArrayList<Double>();
				academy.put(name, volue);
			}
			volue.add(grade);
			num--;
		}
		scan.close();
		academy.entrySet()
			.stream()
			.sorted((f, s) -> {
				double first = f.getValue()
									.stream()
									.mapToDouble(Double::doubleValue)
									.average()
									.getAsDouble();
				double second = s.getValue()
									.stream()
									.mapToDouble(Double::doubleValue)
									.average()
									.getAsDouble();
				return Double.compare(second, first);
			}).forEach(s -> {
				double average = s.getValue()
									.stream()
									.mapToDouble(Double::doubleValue)
									.average()
									.getAsDouble();
				if (average >= 4.5) {
					System.out.printf("%s -> %.2f\n", s.getKey(), average);
				}
			});

	}

}
