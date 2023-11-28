package com.selenium.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.locators.LaunchBrowsers;
import com.selenium.locators.Locators;

public class LoginPage {
	public static void main(String[] args) {
		LaunchBrowser.launchBrowsers();
		WebDriver driver = LaunchBrowser.driver;
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		performLogin(driver);
	}

	// face book login page
	public static void performLogin(WebDriver driver) {
		if (driver != null) {
			driver.get(LaunchBrowsers.browserUrl);
			driver.findElement(By.xpath(Locators.userNameXpath)).sendKeys(Locators.userNameData);
			driver.findElement(By.xpath(Locators.passwordXpath)).sendKeys(Locators.passwordData);
			driver.findElement(By.xpath(Locators.loginXpath)).click();
		} else {
			System.out.println("error");
		}

	}

}
