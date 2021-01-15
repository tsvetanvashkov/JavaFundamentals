package objects_and_classes.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Person> personsList = new ArrayList<OrderByAge.Person>();
		String input = scan.nextLine();
		while (!input.equals("End")) {
			String[] inputArray = input.split(" ");
			String name = inputArray[0];
			String id = inputArray[1];
			int age = Integer.parseInt(inputArray[2]);
			
			Person personObj = new Person(name, id, age);
			personsList.add(personObj);
			
			input = scan.nextLine();
		}
		scan.close();
		Collections.sort(personsList, Person.personAgeComparator);
		
		for (Person person : personsList) {
			System.out.println(person.toString());
		}

	}
	
	static class Person{
		String name;
		String id;
		int age;
		
		public Person(String name, String id, int age) {
			super();
			this.name = name;
			this.id = id;
			this.age = age;
		}
		
		public int getAge() {
			return age;
		}
		
		public static Comparator<Person> personAgeComparator = new Comparator<OrderByAge.Person>() {

			@Override
			public int compare(Person age1, Person age2) {
				int personAge1 = age1.getAge();
				int personAge2 = age2.getAge();
				return personAge1-personAge2;
			}
		};
		
		public String toString() {
			return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
		}
	}

}
