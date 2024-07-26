package abstractmethod;

public  class SavingAccount extends BankAccount {

	public SavingAccount(double balance, String accountno) {
		super(balance, accountno);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public  void deposit(double balance) {
		setBalance(getBalance()+balance);
		System.out.println("Saving Balance deposited= "+balance);
	}
	@Override
	public void withdraw(double balance) {
		if(getBalance()>=balance) {
			setBalance(getBalance()-balance);
			System.out.println("Transaction successfully= "+balance);
		}else {
			System.out.println("Not Enough Balance");
		}
	} 
	
}
