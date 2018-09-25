package entities;

public class BusinessAccount extends AccountHeran�a {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // argumentos da super classe
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		//	deposit(amount);
		}
	}
	@Override
	public void withDraw(double amount) { //saque com juros 
		super.withDraw(amount);
		balance -= 2.0;
	}
	
	
}
/*
 
Heran�a > Rela��o � um 
Generaliza��o e especializa��o
Spuer classe > classe base / sub classe > classe derivada.
Heran�a / exten��o 
Heran�a � uma associa��o entre classes e n�o entre objetos.

*/