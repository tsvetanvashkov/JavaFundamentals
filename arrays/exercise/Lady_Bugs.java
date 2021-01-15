package arrays.exercise;

import java.util.Scanner;

public class Lady_Bugs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fieldSize = Integer.parseInt(scan.nextLine());
		String[] inputLadyBugsIndexes = scan.nextLine().split(" ");
		int[] field = new int[fieldSize];
		
		for (int i = 0; i < inputLadyBugsIndexes.length; i++) {
			int bugIndex = Integer.parseInt(inputLadyBugsIndexes[i]);
				
			if ((bugIndex >= 0) && (bugIndex < fieldSize)) {
				field[bugIndex] = 1;
			}
		}
		
		String command = scan.nextLine();
		while ((command.equals("end")) != true) {
			String[] commandArray = command.split(" ");
			long ladyBugIndex = Long.parseLong(commandArray[0]);
			String direction = commandArray[1];
			long flyLength = Long.parseLong(commandArray[2]);
			long flyIndex = 0;
			
			if ((ladyBugIndex < 0) || (ladyBugIndex >= fieldSize) || (field[(int)ladyBugIndex] != 1) || (flyLength == 0)) {
				command = scan.nextLine();
				continue;
			}
			
			if (flyLength < 0) {
				if (direction.equals("left")) {
					direction = "right";
				}else if (direction.equals("right")) {
					direction = "left";
				}
				flyLength *= -1;
			}
			
			switch (direction) {
			case "right":
				flyIndex = ladyBugIndex + flyLength;
				while (true) {
					if (flyIndex >= fieldSize) {
						field[(int)ladyBugIndex] = 0;
						break;
					}else {
						if (field[(int)flyIndex] == 1) {
							flyIndex += flyLength;
							continue;
						}else {
							field[(int)ladyBugIndex] = 0;
							field[(int)flyIndex] = 1;
							break;
						}
					}
				}
				break;
			case "left":
				flyIndex = ladyBugIndex - flyLength;
				while (true) {
					if (flyIndex < 0) {
						field[(int)ladyBugIndex] = 0;
						break;
					}else {
						if (field[(int)flyIndex] == 1) {
							flyIndex -= flyLength;
							continue;
						}else {
							field[(int)ladyBugIndex] = 0;
							field[(int)flyIndex] = 1;
							break;
						}
					}
				}
				break;
			}
			
			command = scan.nextLine();
		}
		
		scan.close();
		String output = "";
		for (int i = 0; i < fieldSize; i++) {
			output += field[i];
			if (i < (fieldSize - 1)) {
				output += " ";
			}
		}
		
		System.out.println(output);

	}

}
