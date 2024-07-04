package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "jonas", 0.0);
		BusinessAccount bacc = new BusinessAccount(2001, "jonas companie", 0.0, 1000.00);
		
		//UPCAST
		Account aac1 = bacc;
		Account acc2 = new BusinessAccount(2002, "hadassa", 0.0, 2000.00);
		Account acc3 = new SavingAccount(3001, "jonas carteira", 2000.00, 1.00);

		//DOWNCAST
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(100.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
