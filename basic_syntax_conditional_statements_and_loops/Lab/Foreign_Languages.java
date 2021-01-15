package basic_syntax_conditional_statements_and_loops.Lab;

import java.util.Scanner;

public class Foreign_Languages {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String language = scan.nextLine();
		scan.close();
		String out;
		
		if (language.equals("England") || language.equals("USA")) {
			out = "English";
		}else if (language.equals("Spain") || language.equals("Argentina") || language.equals("Mexico")) {
			out = "Spanish";
		}else {
			out = "unknown";
		}
		
		System.out.println(out);

	}

}
