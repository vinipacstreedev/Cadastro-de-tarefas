package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Task;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Task> task = new ArrayList<>();

		while (true) {
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Add task");
			System.out.println("2 - List tasks");
			System.out.println("3 - Complete task");
			System.out.println("0 - Exit");
			System.out.print("Selection: ");
			int option = sc.nextInt();
			sc.nextLine();

			if (option == 1) {
				System.out.print("Task description");
				String desc = sc.nextLine();
				task.add(new Task(desc));
			} else if (option == 2) {
				System.out.println("\n---Your Tasks----");
				for (int i = 0; i < task.size(); i++) {
					System.out.println(i + " - " + task.get(i));
				}
			} else if (option == 3) {
				System.out.print("Enter the task number: ");
				int idx = sc.nextInt();
				if (idx >= 0 && idx < task.size()) {
					task.get(idx).conclude();
					System.out.println("Task completed!");
				} else {
					System.out.println("Invalid number.");
				}
			} else if (option == 0) {
				System.out.println("Leaving");
				break;
			} else {
				System.out.println("Invalid option.");
			}

		}
		sc.close();
	}

}
