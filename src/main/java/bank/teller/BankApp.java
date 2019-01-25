package bank.teller;


import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Bank myBank = new Bank();
		Account account1 = new Account("1111", "Checking", 500);
		Account account2 = new Account("2222", "Savings", 2500);
		myBank.add(account1);
		myBank.add(account2);
		

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the bank of We Can Code It!");
		System.out.println("Here are your accounts at our bank:");
		System.out.println(account1.getAccountNumber() + " " + account1.getType() + " " + account1.getBalance());
		System.out.println(account2.getAccountNumber() + " " + account2.getType() + " " + account2.getBalance());
		System.out.println("What would you like to do?");
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdraw");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to close account");
		System.out.println("Type any other key to exit");
		int userInput = Integer.parseInt(input.nextLine());

		// looping the input conditionals with a while loop

		while (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4) {
			//using a switch statement for the selection and if/else if/else for the options within the selections
			switch (userInput) {
			case 1:
				System.out.println("Enter the account number to choose an account to deposit to:");
				int userAccountSelect = Integer.parseInt(input.nextLine());
				if (userAccountSelect == 1111) {
					System.out.println("You selected " + account1.getAccountNumber());
					System.out.println("Enter a deposit amount: ");
					int amountDeposit = Integer.parseInt(input.nextLine());
					account1.deposit(amountDeposit);
					System.out.println(
							"The new balance for " + account1.getAccountNumber() + " is " + account1.getBalance());
				} else if (userAccountSelect == 2222) {
					System.out.println("You selected " + account2.getAccountNumber());
					System.out.println("Enter a deposit amount: ");
					int amountDeposit = Integer.parseInt(input.nextLine());
					account2.deposit(amountDeposit);
					System.out.println(
							"The new balance for " + account2.getAccountNumber() + " is " + account2.getBalance());
				} else {
					System.out.println("Not a correct account number, system exiting");
					System.exit(0);
				}
				break;
			case 2:
				System.out.println("Enter the account number to choose an account to withdraw from:");
				userAccountSelect = Integer.parseInt(input.nextLine());
				if (userAccountSelect == 1111) {
					System.out.println("You selected " + account1.getAccountNumber());
					System.out.println("Enter a withdrawal amount: ");
					int amountWithdraw = Integer.parseInt(input.nextLine());
					account1.withdraw(amountWithdraw);
					System.out.println(
							"The new balance for " + account1.getAccountNumber() + " is " + account1.getBalance());
				} else if (userAccountSelect == 2222) {
					System.out.println("You selected " + account2.getAccountNumber());
					System.out.println("Enter a withdrawal amount: ");
					int amountWithdraw = Integer.parseInt(input.nextLine());
					account2.withdraw(amountWithdraw);
					System.out.println(
							"The new balance for " + account2.getAccountNumber() + " is " + account2.getBalance());
				} else {
					System.out.println("Not a correct account number, system exiting");
					System.exit(0);
				}
				break;

			case 3:
				System.out.println("Enter the account number that you would like to check the balance:");
				userAccountSelect = Integer.parseInt(input.nextLine());
				if (userAccountSelect == 1111) {
					System.out
							.println("The balance of " + account1.getAccountNumber() + " is: " + account1.getBalance());
				} else if (userAccountSelect == 2222) {
					System.out
							.println("The balance of " + account2.getAccountNumber() + " is: " + account2.getBalance());
				} else {
					System.out.println("Not a correct account number, system exiting");
					System.exit(0);
				}
				break;

			case 4:
				System.out.println("Enter the account number that you would like to close:");
				userAccountSelect = Integer.parseInt(input.nextLine());
				if (userAccountSelect == 1111) {
					System.out.println("You have closed account number " + account1.getAccountNumber());
					myBank.close(account1);
					System.out.println("Your remaining account(s) are: " + myBank.accounts);
				} else if (userAccountSelect == 2222) {
					System.out.println("You have closed account number " + account2.getAccountNumber());
					myBank.close(account2);
					System.out.println("Your remaining account(s) are: " + myBank.accounts);					
				} else {
					System.out.println("Not a correct account number, system exiting");
					System.exit(0);
				}
				break;

			// this should only occur if the code for the while loop or the switch cases are
			// changed
			default:
				System.out.println("Error, an unexpected value has occured");

			}

			System.out.println("What would you like to do?");
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			System.out.println("Press 3 to check balance");
			System.out.println("Press 4 to close account");
			System.out.println("Type any other key to exit");
			userInput = Integer.parseInt(input.nextLine());

		}
		
		//now if any other number besides 1, 2, 3, 4 are entered we are broken out of the loop
		input.close();
		System.out.println("Goodbye, thanks for banking with us!");
		System.exit(0);
		
	}
}