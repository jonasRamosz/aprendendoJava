package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class ATM {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter a initial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.print("Account data: " + account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data");
		System.out.println("Account data: " + account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		account.withDraw(withDrawValue);
		System.out.println("Update account data");
		System.out.print("Account data: " + account);
		
		sc.close();

	}

}
