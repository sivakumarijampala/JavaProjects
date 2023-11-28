package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex {
	static {

		System.setProperty("webdriver.edge.driver", "./dri/msedgedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		// maximizing window in browser
		driver.manage().window().maximize();

		// passing url which website we want to open
		driver.get("https://www.facebook.com/");
		
		  driver.findElement(By.
		  xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")
		 ).click(); Thread.sleep(3000);
		  driver.findElement(By.name("firstname")).sendKeys("sivakumari");
		  Thread.sleep(3000);
		  driver.findElement(By.name("lastname")).sendKeys("jampala");
		  Thread.sleep(5000);
		  driver.findElement(By.name("reg_email__")).sendKeys("siva@gmail.com");
		  Thread.sleep(5000);
		  driver.findElement(By.name("reg_email_confirmation__")).sendKeys(
		  "siva@gmail.com"); Thread.sleep(3000);
		  driver.findElement(By.name("reg_passwd__")).sendKeys("siva123");
		  
		
		  // handling drop downs
			
		  
		    WebElement elememt = driver.findElement(By.id("day"));
			Select se = new Select(elememt);
			// se.selectByIndex(1);
			// se.selectByVisibleText(1);
			se.selectByValue("1");
			
			WebElement ele=driver.findElement(By.id("month"));
			Select s=new Select(ele);
			s.selectByVisibleText("Apr");
			
			//selection radio button
			WebElement radio=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
			boolean isSelected=radio.isSelected();
			if(!isSelected) {
				radio.click();
			}
			
			//clicking submit button
		  Thread.sleep(3000); driver.findElement(By.name("websubmit")).click();
		  Thread.sleep(3000);
		  
		 

		

		
		
		// by using css selector
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("siva@gmail.com");

		// driver.findElement(By.id("email")).sendKeys("siva@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("siva123");

		// by using linked text locator
		// driver.findElement(By.linkText("Forgotten password?")).click();

		// by using partial linked text locator
		//driver.findElement(By.partialLinkText("Forgotten")).click();

	}

}
