package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String user = scan.nextLine();
		String username = "";
		int count = 0;
		
		for (int i = (user.length() - 1); i >= 0; i--) {
			username += user.charAt(i);
		}
		
		String login = scan.nextLine();
			
		while (username.equals(login) != true) {
			count++;
			if (count == 4) {
				break;
			}
			System.out.println("Incorrect password. Try again.");
			login = scan.nextLine();
			
		}
		
		if (count == 4) {
			System.out.printf("User %s blocked!", user);
		}else {
			System.out.printf("User %s logged in.", user);
		}
		scan.close();
		
	}

}
