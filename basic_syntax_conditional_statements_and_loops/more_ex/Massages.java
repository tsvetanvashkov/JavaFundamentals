package basic_syntax_conditional_statements_and_loops.more_ex;

import java.util.Scanner;

public class Massages {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lenght = Integer.parseInt(scan.nextLine());
		String output = "";
		
		for (int i = 0; i < lenght; i++) {
			String num = scan.nextLine();
			int mainDigit = Integer.parseInt(String.valueOf(num)) % 10;
		
			if (mainDigit == 0) {
				output += " ";
				continue;
			}
			
			int offset = (mainDigit -2)*3;

			if (mainDigit > 7) offset++;
			
			int letterIndex = (offset + num.length() -1);
			
			output += (char)(letterIndex + 97);
		
		}
			
		System.out.println(output);	
		scan.close();

	}

}
