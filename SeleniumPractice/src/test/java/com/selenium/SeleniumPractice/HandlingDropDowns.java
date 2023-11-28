package com.selenium.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.locators.LaunchBrowsers;
import com.selenium.locators.Locators;

public class HandlingDropDowns {
	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser.launchBrowsers();
		WebDriver driver = LaunchBrowser.driver;
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		dropDowns(driver);
	}

	public static void dropDowns(WebDriver driver) throws InterruptedException {
		if (driver != null) {
			driver.get(LaunchBrowsers.urlAlertPopUp);
			driver.manage().window().maximize();

			/*
			 * WebElement dropdown =
			 * driver.findElement(By.cssSelector(Locators.selectCssSelector));
			 * 
			 * Select select = new Select(dropdown);
			 * 
			 * // select.selectByValue("swiftx"); select.selectByIndex(3);
			 * 
			 * // select.selectByVisibleText("501 - 1,000 employees"); driver.close();
			 */

			// multiselection

			WebElement drop = driver.findElement(By.cssSelector(Locators.selectCssSelector1));
			Select se = new Select(drop);
			se.selectByIndex(2);
			se.selectByValue(Locators.value);
			se.selectByVisibleText(Locators.visibleText);
			List<WebElement> all = se.getAllSelectedOptions();
			System.out.println(all.size());
			System.out.println("selected options");
			for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i).getText());
			}

			se.deselectAll();
			se.selectByIndex(2);
			se.selectByValue(Locators.value);
			se.deselectByIndex(2);
			List<WebElement> selectedoptions = se.getAllSelectedOptions();
			System.out.println(selectedoptions.size());
			System.out.println("selected options");
			for(int i=0;i<selectedoptions.size();i++) {
			System.out.println(selectedoptions.get(i).getText());
			}

		}
		else {
			System.out.println("error occur");
		}
	}
}
