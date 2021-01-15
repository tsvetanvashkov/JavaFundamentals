package objects_and_classes.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Students {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		Student studentObj;
		List<Student> studentsList = new ArrayList<Student>();
		while (number > 0) {
			String[] input = scan.nextLine().split(" ");
			studentObj = new Student(input[0], input[1], Double.parseDouble(input[2]));
			studentsList.add(studentObj);
			number--;
		}
		scan.close();
		Comparator<Student> comparator = Comparator.comparingDouble(Student::getGrade);
		Collections.sort(studentsList, comparator);
		Collections.reverse(studentsList);
		
		for (Student student : studentsList) {
			System.out.println(student.toString());
		}

	}
	
	static class Student{
		String firstName;
		String lastName;
		double grade;
		
		public Student(String firstName, String lastName, double grade) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.grade = grade;
		}

		public double getGrade() {
			return grade;
		}

		
		public String toString() {
			return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
		}
	}

}
