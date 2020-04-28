package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int studentQuantity = input.nextInt();
		for (int control = 0; control < studentQuantity; control++) {
			int number = input.nextInt();
			set.add(new Student(number));
		}
		System.out.print("How many students for course B? ");
		studentQuantity = input.nextInt();
		for (int control = 0; control < studentQuantity; control++) {
			int number = input.nextInt();
			set.add(new Student(number));
		}
		System.out.print("How many students for course C? ");
		studentQuantity = input.nextInt();
		for (int control = 0; control < studentQuantity; control++) {
			int number = input.nextInt();
			set.add(new Student(number));
		}
		System.out.println("Total students: " + set.size());
		
		input.close();
		
	}

}
