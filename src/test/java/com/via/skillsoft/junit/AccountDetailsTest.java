package com.via.skillsoft.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountDetailsTest {
	
	AccountDetails accountDetails;
	
	@BeforeEach
	void init() {
		accountDetails = new AccountDetails("Anita", 011401533, 114532, 5000, "Savings");
		System.out.println("@BeforeEach block has been executed");
		System.out.println("Account Balance: " + accountDetails.getBalance());
	}
	
	@Test
	public void depositTest() {
		accountDetails.deposit(500);
		System.out.println("@Test block for deposit has been executed");
	}
	
	@Test
	public void withdrawTest() {
		accountDetails.withdraw(1000);
		System.out.println("@Test block for withdraw has been executed");
	}
	
	@AfterEach
	public void balance() {
		System.out.println("@AfterEach has been executed");
		System.out.println("Account Balance: " + accountDetails.getBalance());
	}
}
