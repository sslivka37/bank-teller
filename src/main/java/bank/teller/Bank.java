package bank.teller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	Map<String, Account> accounts = new HashMap<>();


	public void add(Account account){
	    accounts.put(account.getAccountNumber(), account);

	}

	public Account findAccount (String accountNum){
	    return accounts.get(accountNum);
	}

	public Collection<Account> getAllAccounts(){
	    return accounts.values();
	}

	public void close(Account account){
	    accounts.remove(account.getAccountNumber(), account);
	}

	public void withdraw(String accountNumber, int amountWithdraw){
	    Account withdrawFromAccount = findAccount(accountNumber);
	    withdrawFromAccount.withdraw(amountWithdraw);
	}

	public void deposit(String accountNumber, int amountDeposit){
	    Account depositToAccount = findAccount(accountNumber);
	    depositToAccount.deposit(amountDeposit);
	}

}
