package com.selenium.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.locators.LaunchBrowsers;
import com.selenium.locators.Locators;

public class HandlingCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser.launchBrowsers();
		WebDriver driver = LaunchBrowser.driver;
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		checkBoxes(driver);
	}

	public static void checkBoxes(WebDriver driver)  {
		if (driver != null) {
			driver.get(LaunchBrowsers.urlAlertPopUp);
			driver.manage().window().maximize();

			// handling checkboxes
			driver.findElement(By.cssSelector(Locators.checkbox2)).click();
		
			driver.findElement(By.cssSelector(Locators.checkbox2)).click();

			// handling radio buttons
			WebElement radio1 = driver.findElement(By.xpath(Locators.radio1Xpath));
			WebElement radio2 = driver.findElement(By.xpath(Locators.radio2Xpath));
			radio2.click();
			System.out.println(radio2.isSelected());
			System.out.println(radio1.isSelected());

		} else {
			System.out.println("error");
		}

	}
}
