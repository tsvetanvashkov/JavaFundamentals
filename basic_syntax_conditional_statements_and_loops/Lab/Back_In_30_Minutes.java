package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Back_In_30_Minutes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours  = Integer.parseInt(scan.nextLine());
		int minutes  = Integer.parseInt(scan.nextLine());
		scan.close();
		
		minutes += 30;
		
		if (minutes >= 60) {
			minutes -= 60;
			hours++;
			if (hours == 24) {
				hours = 0;
			}
		}
		
		System.out.printf("%d:%02d", hours, minutes);

	}

}
