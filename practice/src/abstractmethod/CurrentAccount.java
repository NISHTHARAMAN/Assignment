package abstractmethod;

public  class CurrentAccount extends BankAccount {

	public CurrentAccount(double balance, String accountno) {
		super(balance, accountno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double balance) {

		setBalance(getBalance()+balance);
		System.out.println("Current Balance deposited= "+balance);
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
