package objects_and_classes.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student2 {
	
	static class Student{
		String firstName;
		String lastName;
		int age;
		String homeTown;
		
		public Student(String firstName, String lastName, int age, String homeTown) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.homeTown = homeTown;
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getHomeTown() {
			return homeTown;
		}
		public void setHomeTown(String homeTown) {
			this.homeTown = homeTown;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> studentsList = new ArrayList<Student2.Student>();
		String input = scan.nextLine();
		while (!input.equals("end")) {
			String[] studentInformation = input.split(" ");
			String studentFirstName = studentInformation[0];
			String studentLastName = studentInformation[1];
			int studentAge = Integer.parseInt(studentInformation[2]);
			String studentHomeTown = studentInformation[3];
			
			if (isStudentExisting(studentsList, studentFirstName, studentLastName)) {
				Student studentObj = getStudent(studentsList, studentFirstName, studentLastName);
				studentObj.setAge(studentAge);
				studentObj.setHomeTown(studentHomeTown);
			}else {
				Student studentObj = new Student(studentFirstName, studentLastName, studentAge, studentHomeTown);
				studentsList.add(studentObj);
			}
			
			input = scan.nextLine();
		}
		
		String searchTown = scan.nextLine();
		scan.close();
		
		for (Student student : studentsList) {
			if (searchTown.equals(student.homeTown)) {
				System.out.printf("%s %s is %d years old\n", student.firstName, student.lastName, student.age);
			}
		}

	}

	private static Student getStudent(List<Student> studentsList, String studentFirstName, String studentLastName) {
		Student existingStudent = null;
		for (Student student : studentsList) {
			if (studentFirstName.equals(student.firstName) && studentLastName.equals(student.lastName)) {
				existingStudent = student;
			}
		}
		return existingStudent;
	}

	private static boolean isStudentExisting(List<Student> studentsList, String studentFirstName,
			String studentLastName) {
		for (Student student : studentsList) {
			if (studentFirstName.equals(student.firstName) && studentLastName.equals(student.lastName)) {
				return true;
			}
		}
		return false;
	}

}
