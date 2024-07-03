package entites;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder, double inicialDeposit) {

		this.number = number;
		this.holder = holder;
		deposit(inicialDeposit);
		
	}

	public Account(int number, String holder) {

		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withDraw(double amount) {
		double hasSaldo = (this.balance - amount) - 5;
		if (hasSaldo < 0) {
			System.out.println(" Saldo insuficiente ");
		} else {
			this.balance -= amount + 5;
			System.out.println("Saldo realizado com sucesso no valor: " + amount);
		}
	}
	
	public String toString() {
		return "Account: " + this.number + ", Holder: " + this.holder + ", Balance: R$" + String.format("%.2f", this.balance); 
	}

}
