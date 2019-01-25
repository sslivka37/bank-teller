package bank.teller;

public class Account {
	private String accountNumber;
	private int balance;
	private String type;

	public Account(String accountNumber, String type, int balance){
	    this.accountNumber = accountNumber;
	    this.balance = balance;
	    this.type = type;
	}

	public String getAccountNumber(){
	    return accountNumber;
	}

	public int getBalance(){
	    return balance;
	}

	public String getType(){
	    return type;
	}

	public void withdraw(int amountWithdraw) {
	    balance -= amountWithdraw;
	}

	public void deposit(int amountDeposit) {
	    balance += amountDeposit;
	}

}
