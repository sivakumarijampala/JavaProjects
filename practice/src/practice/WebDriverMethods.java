package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethods {
	
		static {
			System.setProperty("webdriver.edge.driver","./dri/msedgedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver=new EdgeDriver();
			
			//get method
			driver.get("https://www.facebook.com/");
			
			//maximize method
			driver.manage().window().maximize();
			
			//get cutrrent url method
			String currentUrl=driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			//get title
			String title=driver.getTitle();
			System.out.println(title);
			
			//get page source
			String pageSource=driver.getPageSource();
			System.out.println(pageSource);
			
			//navigate method
			driver.navigate().to("https://www.google.com/");
			
			//close method
			driver.close();
			
	}

}
