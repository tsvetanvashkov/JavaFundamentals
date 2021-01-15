package objects_and_classes.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		List<String> personList = new ArrayList<String>();
		while (number > 0) {
			String[] input = scan.nextLine().split(" ");
			String personName = input[0];
			int personAge = Integer.parseInt(input[1]);
			Person personObj = new Person(personName, personAge);
			if (personObj.age > 30) {
				personList.add(personObj.toString());
			}
			number--;
			
		}
		scan.close();
		Collections.sort(personList);
		for (String person : personList) {
			System.out.println(person);
		}
		

	}
	
	static class Person{
		String name;
		int age;
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public String toString() {
			return String.format("%s - %d", this.name, this.age);
		}
		
	}

}
