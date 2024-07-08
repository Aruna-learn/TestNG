package com.testngpractise;

import org.testng.annotations.Test;

public class PriorityFlightBooking {

	
	@Test(priority=1)
	public void SignUp() {
		System.out.println("Signup");
	}
	
	@Test(priority=2)
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(priority=3)
	public void SearchFortheFlight() {
		System.out.println("SearchFortheFlight");
	}
	
	@Test(priority=4)
	public void BooktheFlight() {
		System.out.println("BooktheFlight");
	}
	
	
	@Test(priority=5)
	public void SaveTicket() {
		System.out.println("SaveTicket");
	}
	
	@Test(priority=6)
	public void Logout() {
		System.out.println("Logout");
	}
	
}
	
	
//If we execute tests in testng test it will execute based on ascii(alphanumeric value) so will get exception to over come we use the testng.xml file 
//In testng.xml file we can execute the test methods as per our order and requirement but we can't write all the methods(ex we hae 20 methods) and if the preserver-order parameter is false it will follow the order execution
//To over come this we use the priority and it will be defined in the inside the Test annotation(ex @Test(priority=6))
//if we didn't specify the priority default it is zero
//and we can use the negative values of priority also because priority is integer and intege value is -2^31 to 2^31-1
//if multiple methods having the same priorrity then fist it will see the methods ascii value then based on ascii value it will execute
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

