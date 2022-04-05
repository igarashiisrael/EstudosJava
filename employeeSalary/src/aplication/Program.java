package aplication;

import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Employee emp = new Employee();
		System.out.println("Enter data:");
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grosssalary = sc.nextDouble();
		System.out.print("Tax:");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee information: "+ emp);
		System.out.println();
		System.out.print("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: "+ emp);
		sc.close();

	}

}
