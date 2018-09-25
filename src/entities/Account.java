package entities;

public class Account {

	private int number; // numero da conta
	private String holder; // nome do titular
	private double balance; // saldo

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); //encapsulamento do método 
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance+= amount; // deposita na conta 
	}
	public void withdraw(double amount) {
		balance-= amount+ 5.0; //desconta - 5,00 a cada saque realizado
	}
	public String toString() {
		return " Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", balance: $"
				+ String.format("%.2f", balance);
	}
	
}
