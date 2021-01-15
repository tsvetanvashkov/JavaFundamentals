package objects_and_classes.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		Article articleObj;
		List<Article> objectList = new ArrayList<Article>();
		while (number > 0) {
			String[] input = scan.nextLine().split(", ");
			articleObj = new Article(input[0], input[1], input[2]);
			objectList.add(articleObj);
			number--;
		}
		String sortCommand = scan.nextLine();
		scan.close();
		switch (sortCommand) {
		case "title":
			Collections.sort(objectList, Article.articleTitleComparator);
			break;
		case "content":
			Collections.sort(objectList, Article.articleContentComparator);
			break;
		case "author":
			Collections.sort(objectList, Article.articleAuthorComparator);
			break;
		}
		
		for (Article article : objectList) {
			System.out.println(article.toString());
		}


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
		
		
		public String getTitle() {
			return title;
		}


		public String getContent() {
			return content;
		}


		public String getAuthor() {
			return author;
		}
		
		public static Comparator<Article> articleTitleComparator = new Comparator<Articles2.Article>() {
			
			@Override
			public int compare(Article article1, Article article2) {
				String articleTitile1 = article1.getTitle();
				String articleTitile2 = article2.getTitle();
				return articleTitile1.compareTo(articleTitile2);
			}
		};
		
		public static Comparator<Article> articleContentComparator = new Comparator<Articles2.Article>() {
			
			@Override
			public int compare(Article article1, Article article2) {
				String articleContent1 = article1.getContent();
				String articleContent2 = article2.getContent();
				return articleContent1.compareTo(articleContent2);
			}
		};
		
		public static Comparator<Article> articleAuthorComparator = new Comparator<Articles2.Article>() {
			
			@Override
			public int compare(Article article1, Article article2) {
				String articleAuthor1 = article1.getAuthor();
				String articleAuthor2 = article2.getAuthor();
				return articleAuthor1.compareTo(articleAuthor2);
			}
		};


		public String toString() {
			return String.format("%s - %s: %s", this.title, this.content, this.author);
		}
	}
}
