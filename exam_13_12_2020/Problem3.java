package exam_13_12_2020;


import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, List<Integer>> followers = new HashMap<String, List<Integer>>();
		String input = scan.nextLine();
		while (!input.equals("Log out")) {
			String[] command = input.split(": ");
			switch (command[0]) {
			case "New follower":
				followers = addFollowers(followers, command[1]);
				break;
			case "Like":
				followers = addLike(followers, command[1], Integer.parseInt(command[2]));
				break;
			case "Comment":
				followers = addComment(followers, command[1]);
				break;
			case "Blocked":
				followers = blocked(followers, command[1]);
				break;
			}
			input = scan.nextLine();
		}
		scan.close();
		System.out.printf("%d followers\n", followers.size());
		followers.entrySet()
				.stream()
				.sorted((first, second) -> {
				int sumFirst = first.getValue()
									.stream()
									.mapToInt(x -> x)
									.sum();
				int sumSecond = second.getValue()
									.stream()
									.mapToInt(x -> x)
									.sum();
				if (sumFirst - sumSecond == 0) {
					return first.getKey().compareTo(second.getKey());
				}else {
					return sumSecond - sumFirst;
				}
				})
				.forEach(follower -> {
					int sum = follower.getValue().stream()
							.mapToInt(x -> x)
							.sum();
					System.out.printf("%s: %d\n", follower.getKey(), sum);
					
				});;

	}

	private static Map<String, List<Integer>> blocked(Map<String, List<Integer>> followers, String username) {
		if (followers.containsKey(username)) {
			followers.remove(username);
		}else {
			System.out.printf("%s doesn't exist.\n", username);
		}
		return followers;
	}

	private static Map<String, List<Integer>> addComment(Map<String, List<Integer>> followers, String username) {
		List<Integer> valueList = followers.get(username);
		if (valueList == null) {
			valueList = new ArrayList<Integer>();
			valueList.add(0);
			valueList.add(1);
		}else {
			valueList.set(1, (valueList.get(1) + 1));
		}
		followers.put(username, valueList);
		return followers;
	}

	private static Map<String, List<Integer>> addLike(Map<String, List<Integer>> followers, String username,
			int count) {
		List<Integer> valueList = followers.get(username);
		if (valueList == null) {
			valueList = new ArrayList<Integer>();
			valueList.add(count);
			valueList.add(0);
		}else {
			valueList.set(0, (valueList.get(0) + count));
		}
		followers.put(username, valueList);
		return followers;
	}

	private static Map<String, List<Integer>> addFollowers(Map<String, List<Integer>> followers, String username) {
		if (!followers.containsKey(username)) {
			List<Integer> valueList = new ArrayList<Integer>();
			valueList.add(0);
			valueList.add(0);
			followers.put(username, valueList);
		}
		return followers;
	}

}
