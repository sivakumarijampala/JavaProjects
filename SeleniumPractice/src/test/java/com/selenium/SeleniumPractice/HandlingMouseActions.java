package com.selenium.SeleniumPractice;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {
	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser.launchBrowsers();
		WebDriver driver = LaunchBrowser.driver;
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		dropDowns(driver);
	}
	
	public static void dropDowns(WebDriver driver) throws InterruptedException {

	
	}

}
