package com.dollarsbank.model;

import java.sql.Date;

public class Transactions extends Customers {

	private int accountNumber;
	private AccountType accountType;
	private String transactionType;
	private Date dateOfTransaction;
	private double Amount;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Transactions [accountNumber=" + accountNumber + ", accountType=" + accountType + ", transactionType="
				+ transactionType + ", dateOfTransaction=" + dateOfTransaction + ", Amount=" + Amount + "]";
	}
	
	
	
	
}