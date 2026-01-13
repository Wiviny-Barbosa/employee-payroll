package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import domain.Employee;
import domain.OutsourceEmployee;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Employee> employees;
		employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int number = scanner.nextInt();
		int contador = 1;
		while(contador <= number) {
			
			System.out.println("Employee #"+contador+" data:");
			System.out.print("Outsourced (y/n)? ");
			char letra = scanner.next().charAt(0);
			if(letra == 'y') {
				System.out.print("Name: ");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.print("Hours: ");
				int hours = scanner.nextInt();
				System.out.print("Value per Hours: ");
				Double valuePerHour = scanner.nextDouble();
				System.out.print("Additional charge: ");
				double additionalCharge = scanner.nextDouble();
				employees.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				System.out.print("Name: ");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.print("Hours: ");
				int hours = scanner.nextInt();
				System.out.print("Value per Hours: ");
				Double valuePerHour = scanner.nextDouble();
				employees.add(new Employee(name, hours, valuePerHour));
			}
			contador++;
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee prd : employees) {
			System.out.println(prd.getName()+" - $ " + String.format("%.2f",prd.payment()));
		}
		scanner.close();
	}
}
