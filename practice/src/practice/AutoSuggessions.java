package practice;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggessions {
	static {

		System.setProperty("webdriver.edge.driver", "./dri/msedgedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='SDkEP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='QCzoEc z1asCe MZy1Rb']")).sendKeys("bangalore");
	    Thread.sleep(5000);
		
		
		/*
		 * element.sendKeys(Keys.ARROW_DOWN); Thread.sleep(3000);
		 * element.sendKeys(Keys.ENTER);
		 */
	   Thread.sleep(3000);
	   
	}

}
