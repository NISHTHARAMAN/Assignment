package abstractmethod;

public abstract class BankAccount {
	
	private double balance;
	private String Accountno;
	
	public BankAccount(double balance, String accountno) {
		
		this.balance = balance;
		this.Accountno = accountno;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountno() {
		return Accountno;
	}

	public void setAccountno(String accountno) {
		Accountno = accountno;
	}

	



	public abstract void deposit(double balance);
	public abstract void withdraw(double balance);

	
}
