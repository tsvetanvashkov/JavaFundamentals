package objects_and_classes.exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMassage {
	
	static class Massage{
		String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
				"Best product of its category.", "Exceptional product.", "I can’t live without this product."};
		String[] events = {"Now I feel good.", "I have succeeded with this product.",
				"Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
				"Try it yourself, I am very satisfied.", "I feel great!"};
		String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
		String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
		
		Random randomGenerator = new Random();
		
		public String rendomMassage() {
			return String.format("%s %s %s - %s", phrases[randomGenerator.nextInt(phrases.length)],
					events[randomGenerator.nextInt(events.length)], authors[randomGenerator.nextInt(authors.length)],
					cities[randomGenerator.nextInt(cities.length)]);
		}
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		Massage massageObj = new Massage();
		
		while (number > 0) {

			System.out.println(massageObj.rendomMassage());
			number--;
		}

	}

}
