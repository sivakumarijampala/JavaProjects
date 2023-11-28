package com.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.SeleniumPractice.LaunchBrowser;

public class VerifyTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.out.println("before method1 starts");
		LaunchBrowser.launchBrowsers();
		driver = LaunchBrowser.driver;
		driver.get("https://www.ebay.com/");
	

	}
	
	@BeforeMethod
	public void tefore() {
		System.out.println("before method 2 starts");
		
	}
	@AfterMethod
	public void ufter(){
		System.out.println("after method1 starts");
		
	}

	@Test
	public void verifyTitle() {
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actuvalTitle = driver.getTitle();
		assertEquals(expectedTitle, actuvalTitle);
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("after method2 starts");
		driver.quit();
		
		
	}
	
	

}
