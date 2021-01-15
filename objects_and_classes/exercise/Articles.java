package objects_and_classes.exercise;

import java.util.Scanner;

public class Articles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(", ");
		Article articleObj = new Article(input[0], input[1], input[2]);
		int number = Integer.parseInt(scan.nextLine());
		while (number > 0) {
			String[] command = scan.nextLine().split(": ");
			switch (command[0]) {
			case "Edit":
				articleObj.edit(command[1]);
				break;
			case "ChangeAuthor":
				articleObj.changeAuthor(command[1]);
				break;
			case "Rename":
				articleObj.rename(command[1]);
				break;
			}
			number--;
		}
		scan.close();
		
		System.out.println(articleObj.toString());

	}
	
	
	
	static class Article{
		String title;
		String content;
		String author;
		
		public Article(String title, String content, String author) {
			super();
			this.title = title;
			this.content = content;
			this.author = author;
		}
		
		public String edit(String content) {
			this.content = content;
			return this.content;
		}
		
		public String changeAuthor(String author) {
			this.author = author;
			return this.author;
		}
		
		public String rename(String title) {
			this.title = title;
			return this.title;
		}
		
		public String toString() {
			return String.format("%s - %s: %s", this.title, this.content, this.author);
		}
	}
}
