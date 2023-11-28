package com.selenium.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.locators.LaunchBrowsers;
import com.selenium.locators.Locators;

public class InstaSignUp {

	public static void main(String[] args){
		LaunchBrowser.launchBrowsers();
		WebDriver driver = LaunchBrowser.driver;
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		instaSignUp(driver);
		driver.quit();
	}

	public static void instaSignUp(WebDriver driver){
		if(driver!=null) {
		driver.get(LaunchBrowsers.browserUrlInsta);
		driver.findElement(By.xpath(Locators.instaSignUpLinkXpath)).click();
		driver.findElement(By.xpath(Locators.mobileNumberFieldXpath)).sendKeys(Locators.mobileNumberFieldData);
		driver.findElement(By.cssSelector(Locators.fullnameCssSelector)).sendKeys(Locators.fullnameFieldData);
		driver.findElement(By.cssSelector(Locators.userNameCssSelector)).sendKeys(Locators.userNameFieldData);
		driver.findElement(By.cssSelector(Locators.passwordCssSelector)).sendKeys(Locators.passwordFieldData);
		driver.findElement(By.cssSelector(Locators.signUpButtoncssSelector)).click();
		}
		else {
			System.out.println("error occur");
		}

	}

}
