package com.via.skillsoft.junit;

public class AccountDetailsTest01 {
	
	AccountDetails accountDetails = new AccountDetails("Anita", 
			011401533, 114532, 5000, "Savings");
	
	void validateName() {
		if(accountDetails.getName().matches("[a-zA-Z]*$")) {
			System.out.println("Test passed: Name is valid");
		} else {
			System.out.println("Test failed: Name is invalid");
		}
	}
	
	public static void main(String[] args) {
		
		AccountDetailsTest01 accountDetailsTest = new AccountDetailsTest01();
		accountDetailsTest.validateName();
	}
}
