package driver;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();
		tasking(scnr, tasks);
		scnr.close();
	}

	public static void tasking(Scanner scnr, ArrayList<String> tasks) {
		int choice;

		do {
			menu();
			choice = scnr.nextInt();
			scnr.nextLine(); // consume newline

			switch (choice) {
				case 1:
					addTask(tasks, scnr);
					break;
				case 2:
					viewTasks(tasks);
					break;
				case 3:
					removeTasks(tasks, scnr);
					break;
				case 4:
					System.out.println("Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 4);
		
	}

	public static void menu() {
		System.out.println("\n--- To-Do List Menu ---");
		System.out.println("1. Add a task");
		System.out.println("2. View all tasks");
		System.out.println("3. Remove a task");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");		
	}
	
	public static void addTask(ArrayList<String> tasklist, Scanner scnr) {
		System.out.print("Enter task: ");
		String task = scnr.nextLine();
		tasklist.add(task);
		System.out.println("Task added!");	
	}
	
	public static void viewTasks(ArrayList<String> tasklist) {
		if (tasklist.isEmpty()) {
			System.out.println("No tasks in the list.");
		} else {
			System.out.println("Your tasks:");
			for (int i = 0; i < tasklist.size(); i++) {
				System.out.println((i + 1) + ". " + tasklist.get(i));
			}
		}		
	}
	
	public static void removeTasks(ArrayList<String> tasklist, Scanner scnr) {
		if (tasklist.isEmpty()) {
			System.out.println("No tasks to remove.");
		} else {
			System.out.print("Enter task number to remove: ");
			int removeIndex = scnr.nextInt() - 1;
			if (removeIndex >= 0 && removeIndex < tasklist.size()) {
				System.out.println("Removed: " + tasklist.remove(removeIndex));
			} else {
				System.out.println("Invalid task number.");
			}
		}		
	}
}
