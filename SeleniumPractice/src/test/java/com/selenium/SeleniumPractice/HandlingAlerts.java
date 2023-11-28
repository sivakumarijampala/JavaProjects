package com.selenium.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.locators.LaunchBrowsers;
import com.selenium.locators.Locators;

public class HandlingAlerts {
	public static void main(String[] args) {
		LaunchBrowser.launchBrowsers();
		WebDriver driver = LaunchBrowser.driver;
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		alert(driver);
		confirmationDialog(driver);
		prompt(driver);
	}

	// handling alert popup
	public static void alert(WebDriver driver) {
		if (driver != null) {
			driver.get(LaunchBrowsers.urlAlertPopUp);
			driver.manage().window().maximize();
			driver.findElement(By.xpath(Locators.alertPopUpButtonXpath)).click();
			Alert a = driver.switchTo().alert();
			a.accept();
		}

	}

	// reading text in confirmation dialog
	public static void confirmationDialog(WebDriver driver) {
		if (driver != null) {
			driver.get(LaunchBrowsers.urlAlertPopUp);
			driver.manage().window().maximize();
			driver.findElement(By.xpath(Locators.confirmationPopUpButtonXpath)).click();
			Alert a = driver.switchTo().alert();
			String b = a.getText();
			System.out.println("the text present inside the popup is" + "...." + b);
			a.dismiss();
			// a.accept();

		}
	}

	// entering data into prompt text box
	public static void prompt(WebDriver driver) {
		driver.get(LaunchBrowsers.urlPromptPopUp);
		driver.findElement(By.xpath(Locators.promptPopUpButtonXpath)).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys(Locators.promptData);
		a.accept();
	}

}
