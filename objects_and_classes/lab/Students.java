package objects_and_classes.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
	
	static class Student{
		String firstName;
		String lastName;
		int age;
		String homeTown;
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
		List<Student> studentsList = new ArrayList<Students.Student>();
		String input = scan.nextLine();
		while (!input.equals("end")) {
			String[] studentInformation = input.split(" ");
			String studentFirstName = studentInformation[0];
			String studentLastName = studentInformation[1];
			int studentAge = Integer.parseInt(studentInformation[2]);
			String studentHomeTown = studentInformation[3];
			
			Student studentObj = new Student();
			studentObj.setFirstName(studentFirstName);
			studentObj.setLastName(studentLastName);
			studentObj.setAge(studentAge);
			studentObj.setHomeTown(studentHomeTown);
			
			studentsList.add(studentObj);
			
			input = scan.nextLine();
		}
		
		String searchTown = scan.nextLine();
		scan.close();
		
		for (int i = 0; i < studentsList.size(); i++) {
			if (searchTown.equals(studentsList.get(i).homeTown)) {
				System.out.printf("%s %s is %d years old\n", 
						studentsList.get(i).firstName, studentsList.get(i).lastName, studentsList.get(i).age);
			}
		}

	}

}
