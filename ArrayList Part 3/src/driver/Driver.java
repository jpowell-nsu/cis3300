package driver;

import java.util.ArrayList;
import student.Student;

public class Driver {
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		Student student1 = new Student(145044781, "Genevieve", "Pekkanen", "Pekkanen@cis3300.edu", 71.25);
		Student student2 = new Student(159259241, "Gréagóir", "Bristol", "Bristol@cis3300.edu", 93.36);
		Student student3 = new Student(128597047, "Domingos", "Sommer", "Sommer@cis3300.edu", 84.2);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		System.out.println(students);
		
		Student student;
		for (int i = 0; i < students.size(); i++) {
			student = students.get(i);
			System.out.println(student.ID);
			System.out.println(student.first);
			System.out.println(student.last);
			System.out.println(student.email);
			System.out.println(student.score);
			System.out.println("---------------");
		}
		
		// contains, indexOf, lastIndexOf, sort, etc will not work as expected
		// you'll learn later how to get them to work with objects		
	}

}
