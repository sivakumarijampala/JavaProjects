package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.SeleniumPractice.LaunchBrowser;
import com.selenium.locators.LaunchBrowsers;
import com.selenium.locators.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillaryLoginPage {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		LaunchBrowser.launchBrowsers();
		driver=LaunchBrowser.driver;
		driver.get(LaunchBrowsers.facebookUrl);
		driver.manage().window().maximize();

	}
	
	@Test(priority = 1,description = "login page")
	public void firstTest() {
		if(driver!=null) {
		driver.findElement(By.id("email")).sendKeys("siva@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dghj");
		driver.findElement(By.id("loginbutton")).click();
		}
	}
	
	@Test(priority = 2,description = "")
	public void secondTest() {
		System.out.println("this is second test");
	}

	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
