package associative_arrays_lambda_and_stream.exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForceBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, List<String>> fBook = new LinkedHashMap<String, List<String>>();
		String input = scan.nextLine();
		while (!input.equals("Lumpawaroo")) {
			if (input.contains(" | ")) {
				String[] inputArray = input.split("[ | ]+");
				String forceSide = inputArray[0];
				String forceUser = inputArray[1];
				List<String> valueList = fBook.get(forceSide);
				if (valueList == null) {
					valueList = new ArrayList<String>();
					fBook.put(forceSide, valueList);
				}
				valueList.add(forceUser);
			}else if (input.contains(" -> ")) {
				String[] inputArray = input.split(" -> ");
				String forceUser = inputArray[0];
				String forceSide = inputArray[1];
				List<String> valueList = fBook.get(forceSide);
				fBook.entrySet().stream()
				.forEach(e -> {
					e.getValue().stream()
						.forEach(w -> {
							if (w.contains(forceUser)) {
								if (e.getValue().size() == 1) {
									fBook.remove(e.getKey());
								}else {
									e.getValue().remove(w);
								}
							}
						});
				});
				if (valueList == null) {
					valueList = new ArrayList<String>();
					fBook.put(forceSide, valueList);
				}
				valueList.add(forceUser);
				System.out.printf("%s joins the %s side!\n", inputArray[0], inputArray[1]);
			}
			input = scan.nextLine();
		}
		scan.close();
		
		fBook.entrySet().stream()
		.sorted((f,s) -> {
			int result = s.getValue().size() - (f.getValue().size());
			if (result == 0) {
				result = f.getKey().compareTo(s.getKey());
			}
			return result;
		}).forEach(e -> {
			System.out.printf("Side: %s, Members: %d\n", e.getKey(), e.getValue().size());
			e.getValue().stream()
					.sorted((f, s) -> f.compareTo(s))
					.forEach(p -> System.out.printf("! %s\n", p));
		});
		

	}

//	private static Map<String, List<String>> writeForceBook(Map<String, List<String>> fBook, String forceSide,
//			String forceUser) {
//			List<String> valueList = fBook.get(forceSide);
//			if (valueList == null) {
//				valueList = new ArrayList<String>();
//				fBook.put(forceSide, valueList);
//			}
////			for (Map.Entry<String, List<String>> entry : fBook.entrySet()) {
////				for (String user : entry.getValue()) {
////					if (user.contains(forceUser)) {
////						if (entry.getValue().size() == 1) {
////							fBook.remove(entry.getKey());
////						}
////						else {
////							entry.getValue().remove(user);
////						}
////					}
////				}
////			}
//			fBook.entrySet().stream()
//					.forEach(e -> {
//						e.getValue().stream()
//							.forEach(w -> {
//								if (w.contains(forceUser)) {
//									if (e.getValue().size() == 1) {
//										fBook.remove(e.getKey());
//									}else {
//										e.getValue().remove(w);
//									}
//								}
//							});
//					});
//			valueList.add(forceUser);
//
//		return fBook;
//	}

}
