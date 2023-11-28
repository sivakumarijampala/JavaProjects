
package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgMethods {
	
	@BeforeTest
	public void loginToApplication() {
		System.out.println("login to application");
	}
	
	@BeforeMethod
	public void connectionToDataBase() {
		System.out.println("connection to db");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@AfterMethod
	public void disconnectionFromDB() {
		System.out.println("disconnection connection to db");
	}
	
	@AfterTest
	public void logoutToApplication() {
		System.out.println("logout to application");
	}

}
