import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;





import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

import bank.teller.Account;
import bank.teller.Bank;

public class BankTest {
	
	Bank underTest;
    Account account1;
    Account account2;

    @Before
    public void setUp() {
        underTest = new Bank();
        account1 = new Account("1", "Checking", 100);
        account2= new Account ("2", "Savings", 100);
    }


    @Test
    public void shouldBeAbleToAddAccount() {
        underTest.add(account1);
        Account retrievedAccount = underTest.findAccount("1");
        assertThat(retrievedAccount, is(account1));
    }


    @Test
    public void shouldBeAbleToAddTwoAccounts() {
        underTest.add(account1);
        underTest.add(account2);
        Collection<Account> allAccounts = underTest.getAllAccounts();
        assertThat(allAccounts, containsInAnyOrder(account1, account2));
        //or could assertEquals(2, allAccounts.size());
    }


    @SuppressWarnings("deprecation")
	@Test
    public void shouldBeAbleToCloseAccount(){
        underTest.add(account1);
        underTest.close(account1);
        Account retrievedAccount = underTest.findAccount(account1.getAccountNumber());
        assertThat(retrievedAccount, is (nullValue()));
    }


    @SuppressWarnings("deprecation")
	@Test
    public void shouldBeAbleToWithdraw(){
        underTest.add(account1);
        underTest.withdraw(account1.getAccountNumber(), 50);
        assertThat(account1.getBalance(), is(50));

    }

    //need to make a test to deposit to account
    @SuppressWarnings("deprecation")
	@Test
    public void shouldBeAbleToDeposit(){
        underTest.add(account1);
        underTest.deposit(account1.getAccountNumber(), 50);
        assertThat(account1.getBalance(), is(150));

    }





}
