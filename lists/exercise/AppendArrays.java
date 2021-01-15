package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> listInt = new ArrayList<Integer>();
		String[] input = scan.nextLine().split("[|]");
		scan.close();
		
		for (int i = input.length - 1; i >= 0; i--) {
			String[] values = input[i].split("\\s+");
			for (int j = 0; j < values.length; j++) {
				if (values[j].equals("")) {
					continue;
				}
				listInt.add(Integer.parseInt(values[j]));
			}
		}
		
		String output = "";
		for (int i = 0; i < listInt.size(); i++) {
			output += listInt.get(i);
			if (i < (listInt.size() - 1)) {
				output += " ";
			}
		}
		System.out.println(output);

	}

}
