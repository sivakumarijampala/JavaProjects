package com.selenium.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.selenium.locators.LaunchBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static String browser = LaunchBrowsers.browserLaunch;
	public static WebDriver driver;

	public static void main(String[] args) {
		launchBrowsers();
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		driver.get(LaunchBrowsers.browserUrl);
	}

	// launching browsers
	public static void launchBrowsers() {
		if (browser.equals(LaunchBrowsers.browserEdge)) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equals(LaunchBrowsers.browserChrome)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals(LaunchBrowsers.browserFirefox)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}

}
