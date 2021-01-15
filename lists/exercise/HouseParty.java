package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfCommands = Integer.parseInt(scan.nextLine());
		List<String> partyList = new ArrayList<String>();
		for (int i = 0; i < numberOfCommands; i++) {
			String[] input = scan.nextLine().split(" ");
			String name = input[0];
			if (input[2].equals("not")) {
				if (partyList.contains(name)) {
					partyList.remove(name);
				}else {
					System.out.println(name + " is not in the list!");
				}
			}else {
				if (partyList.contains(name)) {
					 System.out.println(name + " is already in the list!");
				}else {
					partyList.add(name);
				}
			}
			
		}
		
		for (int i = 0; i < partyList.size(); i++) {
			System.out.println(partyList.get(i));
		}
		scan.close();

	}

}
