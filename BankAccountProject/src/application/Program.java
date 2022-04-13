package application;

import java.util.Scanner;

import entities.Account;

public class Program {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an inital deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println(" Enter inital deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account (number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println(" Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println(" Enter a withdraw value: ");
		double whithdrawValue = sc.nextDouble();
		account.withdraw(whithdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		
		sc.close();
	}

}
