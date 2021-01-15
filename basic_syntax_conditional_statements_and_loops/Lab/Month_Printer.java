package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Month_Printer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month  = Integer.parseInt(scan.nextLine());
		scan.close();
		String out;
		
		switch (month) {
		case 1:
			out = "January";
			break;
		case 2:
			out = "February";
			break;
		case 3:
			out = "March";
			break;
		case 4:
			out = "April";
			break;
		case 5:
			out = "May";
			break;
		case 6:
			out = "June";
			break;
		case 7:
			out = "July";
			break;
		case 8:
			out = "August";
			break;
		case 9:
			out = "September";
			break;
		case 10:
			out = "October";
			break;
		case 11:
			out = "November";
			break;
		case 12:
			out = "December";
			break;

		default:
			out = "Error!";
			break;
		}
		
		System.out.println(out);

	}

}
