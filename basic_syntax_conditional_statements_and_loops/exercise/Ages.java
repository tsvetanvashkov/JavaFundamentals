package basic_syntax_conditional_statements_and_loops.exercise;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ages = scan.nextInt();
		scan.close();
		String out;
		
		if ((0 <= ages) && (ages < 3)) {
			out = "baby";
		}else if ((3 <= ages) && (ages < 14)) {
			out = "child";
		}else if ((14 <= ages) && (ages < 20)) {
			out = "teenager";
		}else if ((20 <= ages) && (ages < 66)) {
			out = "adult";
		}else {
			out = "elder";
		}
		
		System.out.println(out);
	}

}
