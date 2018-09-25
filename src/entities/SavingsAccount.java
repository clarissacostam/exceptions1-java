package entities;

public class SavingsAccount extends AccountHerança{

	private Double interestRate; //taxas de juros
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance += balance * interestRate; // atualiza a conta saldo + juros
	}
	@Override
	public void withDraw(double amount) { //saque sem juros
		balance-= amount;
	}
}
