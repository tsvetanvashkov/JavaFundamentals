package associative_arrays_lambda_and_stream.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		Map<String, String> parkingUser = new LinkedHashMap<String, String>();
		while (num > 0) {
			String[] input = scan.nextLine().split(" ");
			switch (input[0]) {
			case "register":
				parkingUser = registerUser(parkingUser, input[1], input[2]);
				break;
			case "unregister":
				parkingUser = unregisterUser(parkingUser, input[1]);
				break;
			}
			num--;
		}
		scan.close();
		for (Map.Entry<String, String> entry : parkingUser.entrySet()) {
			System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
		}

	}

	private static Map<String, String> unregisterUser(Map<String, String> parkingUser, String name) {
		String value = parkingUser.get(name);
		if (value != null) {
			parkingUser.remove(name);
			System.out.printf("%s unregistered successfully\n", name);
		}else {
			System.out.printf("ERROR: user %s not found\n", name);
		}
		return parkingUser;
	}

	private static Map<String, String> registerUser(Map<String, String> parkingUser, String name, String licensePlateNumber) {
		String value = parkingUser.get(name);
		if (value == null) {
			parkingUser.put(name, licensePlateNumber);
			System.out.printf("%s registered %s successfully\n", name, licensePlateNumber);
		}else {
			System.out.printf("ERROR: already registered with plate number %s\n", licensePlateNumber);
		}
		return parkingUser;
	}

}
