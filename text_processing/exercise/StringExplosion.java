package text_processing.exercise;

import java.util.Scanner;

public class StringExplosion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		scan.close();
		String output = "";
		boolean explosion = false;
		int strenght = 0;
		for (int i = 0; i < text.length(); i++) {
			if (explosion) {
				strenght += Integer.parseInt(text.substring(i, i + 1));
				explosion = false;
			}
			if (text.charAt(i) == '>') {
				explosion = true;
				output += text.charAt(i); 
				continue;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
			}
			if (strenght == 0) {
				output += text.charAt(i); 
			}else {
				strenght--;
			}
			
			
		}
		
		System.out.println(output);

	}

}
