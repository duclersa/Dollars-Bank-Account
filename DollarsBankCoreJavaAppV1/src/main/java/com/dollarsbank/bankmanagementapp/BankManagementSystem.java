package com.dollarsbank.bankmanagementapp;
//all my imports
import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.dollarsbank.connectionfactory.ConnectionFactory;
import com.dollarsbank.model.*;
import java.util.*;
import java.sql.ResultSet;

public class BankManagementSystem {
	
	//creating the account
	public void createAccount() {
		Connection conn = ConnectionFactory.getConnection();
		
		Scanner newCust = new Scanner(System.in);
			
		try {
			Statement stmt = conn.createStatement();
			
			System.out.println("To Start, enter your full name");
			String fullname = newCust.nextLine();
			
			System.out.println("Enter you phone number");
			int phoneNum = newCust.nextInt();
			
			System.out.println("Enter your address");
			String address = newCust.nextLine();
			
			System.out.println("Enter your email");
			String email = newCust.nextLine();
			
			System.out.println("Enter a password at least 6 characters long consisting of numbers, letters, & symbols");
			String password = newCust.nextLine();
			
			//come back to this
			System.out.println("Enter the account type you want");
			String accountType = newCust.nextLine();

			
			System.out.println("Enter an initial amount to open up the account");
			double amount = newCust.nextDouble();
			
			
			int insert = stmt.executeUpdate("INSERT INTO accountbankdb" +
			"(customerName, phoneNumber, Address, Email, Password, accountType, Amount)" + "values (?, ?, ?, ?, ?, ?, ?");
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//user login
	
	public void login() {
		
		Connection conn = ConnectionFactory.getConnection();
		Scanner login = new Scanner(System.in);
		
		try {
			Statement loginStmt = conn.createStatement();
			
			System.out.println("Enter your email:");
			String username = login.nextLine();
			
			System.out.println("Enter your password");
			int logPasswd = login.nextInt();
			
			ResultSet rs = loginStmt.executeQuery("SELECT FROM accountbankdb WHERE Email = '" + username + "' AND Password = '" + logPasswd +"'; ");
		
			if(rs.next() == true) {
				System.out.println("Log in Successful!");
				 
			}
			else {
				System.out.println("User does not exist, TRY AGAIN, OR CREATE ACCOUNT!");
			}
			loginStmt.close();
			conn.close(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//retrieving customer data
	public boolean customerInfo() {
		
		Connection conn = ConnectionFactory.getConnection();
		Scanner customerData = new Scanner(System.in);
		try {
			Statement accountDetails = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
