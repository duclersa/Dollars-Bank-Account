package com.dollarsbank.model;

import java.io.Serializable;

public class Customers implements Serializable {
	
	private String customerName;
	private int phoneNumber;
	private String Address;
	private String Email;
	private AccountType accountType;
	private String Password;
	private double Amount;
	
	
	public Customers() {
		super();
	}
	
	public Customers(String customerName, int phoneNumber, String address, String email, AccountType accountType,
			String password) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		Address = address;
		Email = email;
		this.accountType = accountType;
		Password = password;
		this.Amount = Amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = Amount;
	}
	@Override
	public String toString() {
		return "Customers [customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", Address=" + Address
				+ ", Email=" + Email + ", accountType=" + accountType + ", Password=" + Password + " , Amount=" + Amount + "]";
	}
	
	
}
