package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Scanner input = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int studentQuantity = input.nextInt();
		for (int control = 0; control < studentQuantity; control++) {
			int number = input.nextInt();
			a.add(number);
		}
		
		System.out.print("How many students for course B? ");
		studentQuantity = input.nextInt();
		for (int control = 0; control < studentQuantity; control++) {
			int number = input.nextInt();
			b.add(number);
		}
		
		System.out.print("How many students for course C? ");
		studentQuantity = input.nextInt();
		for (int control = 0; control < studentQuantity; control++) {
			int number = input.nextInt();
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		

		System.out.println("Total students: " + total.size());
		
		input.close();
		
	}

}
