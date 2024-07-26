package practice;

class Customer {
 private String firstName;
 private String lastName;

 /*public Customer(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }*/

 public String getFirstName() {
     return firstName;
 }
 public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

 public String getLastName() {
     return lastName;
 }
 public void setLastName(String lastName) {
		this.lastName = lastName;
	}
 public void getdata() {
	  firstName="Pranchal";
	  lastName="Lakhani";
	  
	}
 
}


class Account {
 private Customer customer;
 private double balance;

 public Account(Customer customer, double balance) {
     this.customer = customer;
     this.balance = balance;
 }

 public Customer getCustomer() {
     return customer;
 }
 public void setCustomer(Customer customer) {
     this.customer = customer;
 }

 public double getBalance() {
     return balance;
 }

 public void setBalance(double balance) {
     this.balance = balance;
 }
}



public class Bank {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.getdata();
		Account currentAccount = new Account(customer, 1000.0);
        Account savingsAccount = new Account(customer, 500.0);

        System.out.println("Current Account:");
        System.out.println("Customer Name: " + currentAccount.getCustomer().getFirstName() + " " + currentAccount.getCustomer().getLastName());
        System.out.println("Balance: " + currentAccount.getBalance());
        System.out.println();

        System.out.println("Savings Account:");
        System.out.println("Customer Name: " + savingsAccount.getCustomer().getFirstName() + " " + savingsAccount.getCustomer().getLastName());
        System.out.println("Balance: " + savingsAccount.getBalance());

	}

}
