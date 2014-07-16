/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaretest2;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	// set string variable private
	private long accountNumber;
	// set string variable
	private String accountType;
	// set string variable
	private String accountStatus;
	// set double string variable
	protected double accountBalance;
	// set string class dateOpened
	private Date dateOpened;
	// set string class openBy
	private String openBy;
	// set date class date of Transaction
	private Date dateOfTransaction;
	// Add a new array list to store the customers' profile
	ArrayList<User> accountOwners = new ArrayList<User>();
	private int pinNumber;

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public void newUser() {
		User user = new User();
		this.accountOwners.add(user);
	}

	/*
	 * get a list of account owners
	 * 
	 * @return accountOwners
	 */
	public ArrayList<User> getaccountOwners() {
		return accountOwners;
	}

	public void setAccountOwners(ArrayList<User> accountOwners) {
		this.accountOwners = accountOwners;
	}

	/*
	 * get account status
	 * 
	 * @return account status
	 */
	public String getAccountStatus() {
		return accountStatus; // get the accountStatus
	}

	/* get set account status */
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus; // set the accountStatus
	}

	/*
	 * get account number
	 * 
	 * @return account number
	 */
	public long getAccountNumber() {
		return accountNumber; // get the accountNumber
	}

	/*
	 * get account type
	 * 
	 * @return account type
	 */
	public String getAccountType() {
		return accountType; // get the accountType
	}

	/*
	 * get account balance
	 * 
	 * @return account balance
	 */
	public double getAccountBalance() {
		return accountBalance; // get the accountBalance
	}

	/*
	 * get account date opened
	 * 
	 * @return date opened
	 */
	public Date getdateOpend() {
		/**
		 * liaofeng says: pay attention to getter's name the dateOpened's getter
		 * is getDateOpened, not getdateOpened
		 */
		return dateOpened; // get the dateOpened
	}

	/*
	 * get account open by
	 * 
	 * @return open by
	 */
	public String getopenBy() {
		/**
		 * liaofeng says: change getopenBy() to getOpenBy()
		 */
		return openBy; // get the openBy
	}

	/*
	 * get account date of Transaction
	 * 
	 * @return date of transaction
	 */
	public Date getdateOfTransaction() {
		/**
		 * liaofeng says: recorrect the getter name also
		 */
		return dateOfTransaction; // get the dateOftransction
	}

	/*
	 * Establish account method with String parameter account type, and double
	 * parameter,initial deposit set account balance as initial balance; set
	 * account type as checking account; set account number generate random
	 * number between 1 and 1000; set account status to active; set account open
	 * date as current time; Print out to ensure that the account has opened;
	 */
	// establish the constructor Account with parameter accountNumber and long
	// type
	public Account(String lastName, String firstName, String address,
			String city, String state, String zipCode,
			String socialSecurityNumber, String accountNumber,
			double accountBalance, String accountType) {
		return;

	}

	public Account(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	// establish the constructor Account with type long and
	// double,accountNumber, initialBalance
	public Account(long accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = initialBalance;
	}

	// establish a deposit method which the account balance equals initial
	// amount + deposit amount
	// update the time when deposit
	public double deposit(double amount) {
		accountBalance = accountBalance + amount;
		this.dateOfTransaction = new Date();
		System.out
				.println("Hi,dear customer, the deposit is sucessful and your current balance is"
						+ " "
						+ accountBalance
						+ " "
						+ "And the last date of transaction is"
						+ " "
						+ dateOfTransaction);
		return amount;
	}

	// establish the withdraw method and require to withdraw only if
	// account status is active and the withdraw amount is less than the account
	// balance
	public void withdraw(double withdrawAmount) {
		if (accountStatus == "Active" && withdrawAmount <= accountBalance) {
			accountBalance = accountBalance - withdrawAmount; // if the account
																// status is
																// active and
																// withdraw
																// amount is
																// lesser than
																// the account
																// balance, then
																// withdraw the
																// money
			System.out
					.println("Your withdraw is sucessful and the current balance is"
							+ " " + accountBalance);
		} else if (accountStatus == "NotActive"
				&& withdrawAmount <= accountBalance)
			System.out.println("Your account is not active");// if the account
																// status is not
																// active, than
																// print the
																// amount is not
																// active
		else if (accountStatus == "Active" && withdrawAmount > accountBalance)
			System.out.println("You don't have sufficient amount"); // If the
																	// account
																	// is active
																	// but not
																	// have
																	// sufficient
																	// amount,
																	// print the
																	// "do not have sufficient amount"
		else
			System.out
					.println("Your account is not active and you don't have sufficient amount");
		this.dateOfTransaction = new Date();
		System.out.println("The last date of trasaction is:" + " "
				+ dateOfTransaction);
	} // else print out the both conditions can not be satisfied    
}
