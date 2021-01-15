package text_processing.exercise;

import java.util.Scanner;

public class ExtractFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String path = scan.nextLine();
		scan.close();
		String fileName = "";
		String fileExtension = "";
		boolean isExtension = true;
		boolean isName = true;
		for (int i = (path.length() - 1); i >= 0; i--) {
			if (isExtension) {
				if (path.charAt(i) == '.') {
					isExtension = false;
					continue;
				}
				fileExtension = path.charAt(i) + fileExtension;
				continue;
			}
			if (isName) {
				if (path.charAt(i) == '\\') {
					isName = false;
					break;
				}
				fileName = path.charAt(i) + fileName;
			}
		}
		
		System.out.println("File name: " + fileName);
		System.out.println("File extension: " + fileExtension);

	}

}
