package entities;

public abstract class AccountHeran�a { // classe abstrata n�o pode ser instanciada

	private Integer number;
	private String holder;
	protected Double balance;
	
	public AccountHeran�a() {
		
	}

	public AccountHeran�a(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	public void withDraw(double amount) { //saque com juros 
		balance-= amount + 5.0;
	}
	public void deposit(double amount) { //deposito
		balance+= amount;
	}
}
