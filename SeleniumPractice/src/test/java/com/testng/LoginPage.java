package com.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@Test(priority = 1,description = "this is login test")
	public void loginTest() {
		System.out.println("login");
	}
	
	@Test(priority = 2,description = "this is logout test")
	public void logOut() {
		System.out.println("logout");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test method");
	}

}
