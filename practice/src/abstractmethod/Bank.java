package abstractmethod;

public class Bank {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(2000,"123456789");
		sa.deposit(500);
		sa.withdraw(100);
		System.out.println(sa.getBalance());
		System.out.println();
		
		CurrentAccount ca = new CurrentAccount(2500,"987654321");
		ca.deposit(500);
		ca.withdraw(100);
		ca.withdraw(3000);
		System.out.println(ca.getBalance());

	}

}
