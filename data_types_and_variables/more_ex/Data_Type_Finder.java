package data_types_and_variables.more_ex;

import java.util.Scanner;

public class Data_Type_Finder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String dataType = "";
		boolean floating = false;
		
		while (input.equals("END") != true) {
			if (((int)input.charAt(0) == 45) || ((int)input.charAt(0) >= 48) && ((int)input.charAt(0) <= 57)) {
				
				for (int i = 1; i < input.length(); i++) {
					if ((int)input.charAt(i) == 46) {
						floating = true;
					}
					if ((((int)input.charAt(i) < 48) || ((int)input.charAt(i) > 57))) {
						dataType = "string";
						break;
					} 
				}
				
				if (((int)input.charAt(0) == 45) && (input.length() == 1)) {
					dataType = "character";
				}
				if (floating) {
					dataType = "floating point";
					floating = false;
				}
				dataType = "integer";
				
			}else {
				if (input.length() == 1) {
					dataType = "character";
				}else if (input.equals("true") || input.equals("false")) {
					dataType = "boolean";
				}else {
					dataType = "string";
				}
			}
			System.out.printf("%s is %s type\n", input, dataType);
			
			input = scan.nextLine();
			
		}
		scan.close();		

	}

}
