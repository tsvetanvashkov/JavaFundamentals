package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftUniCoursePlanning {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> course = new ArrayList<String>();
		course = getValue(scan);
		course = commandsModify(course, scan);
		printing(course);

	}

	private static void printing(List<String> course) {
		for (int i = 0; i < course.size(); i++) {
			System.out.printf("%d.%s\n", (i + 1), course.get(i));
		}
		
	}

	private static List<String> commandsModify(List<String> course, Scanner scan) {
		String command = scan.nextLine();
		while (!command.equals("course start")) {
			String[] commandArray = command.split("[:]");
			switch (commandArray[0]) {
			case "Add":
				course = addLesson(course, commandArray[1]);
				break;
			case "Insert":
				course = insertLesson(course, commandArray[1], Integer.parseInt(commandArray[2]));
				break;
			case "Remove":
				course = removeLesson(course, commandArray[1]);
				break;
			case "Swap":
				course = swapLessons(course, commandArray[1], commandArray[2]);
				break;
			case "Exercise":
				course = addExercise(course, commandArray[1]);
				break;
			}
			
			command = scan.nextLine();
		}
		
		return course;
	}

	private static List<String> addExercise(List<String> course, String lessonTitle) {
		if (course.contains(lessonTitle)) {
			if (!course.contains(lessonTitle + "-Exercise")) {
				course.add((course.indexOf(lessonTitle) + 1), (lessonTitle + "-Exercise"));
			}
		}else {
			course.add(lessonTitle);
			course.add(lessonTitle + "-Exercise"); 
		}
		return course;
	}

	private static List<String> swapLessons(List<String> course, String lessonTitle1, String lessonTitle2) {
		if (course.contains(lessonTitle1) && course.contains(lessonTitle2)) {
			int index1 = course.indexOf(lessonTitle1);
			int index2 = course.indexOf(lessonTitle2);
			course.remove(lessonTitle1);
			course.add(index2, lessonTitle1);
			course.remove(lessonTitle2);
			course.add(index1, lessonTitle2);
			if (course.contains(lessonTitle1 + "-Exercise")) {
				course.remove(lessonTitle1 + "-Exercise");
				course.add((index2 + 1), (lessonTitle1 + "-Exercise"));
			}
			if (course.contains(lessonTitle2 + "-Exercise")) {
				course.remove(lessonTitle2 + "-Exercise");
				course.add((index1 + 1), (lessonTitle2 + "-Exercise"));
			}
		}
		
		return course;
	}

	private static List<String> removeLesson(List<String> course, String lessonTitle) {
		if (course.contains(lessonTitle)) {
			course.remove(lessonTitle);
		}
		if (course.contains(lessonTitle + "-Exercise")) {
			course.remove(lessonTitle + "-Exercise");
		}
		return course;
	}

	private static List<String> insertLesson(List<String> course, String lessonTitle, int index) {
		if (!course.contains(lessonTitle)) {
			course.add(index, lessonTitle);
		}
		return course;
	}

	private static List<String> addLesson(List<String> course, String lessonTitle) {
		if (!course.contains(lessonTitle)) {
			course.add(lessonTitle);
		}
		return course;
	}

	private static List<String> getValue(Scanner scan) {
		String[] input = scan.nextLine().split(", ");
		List<String> output = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			output.add(input[i]);
		}
		return output;
	}

}
