package TestCases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetWindowHandles {

String expectedURL = "https://www.booking.com/";
	
	@Test
	public void userAbleToValidateUserNameInputField() throws InterruptedException {
		String Comdir = System.getProperty("user.dir");
		String ChromeDir = Comdir + "/browsers/chromedriver";
		System.setProperty("webdriver.chrome.driver", ChromeDir);
		WebDriver driver = new ChromeDriver();
		
		driver.get(expectedURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement login = driver.findElement(By.cssSelector("#cross-product-bar > div > a:nth-child(2) > span"));
		login.click();
		Thread.sleep(2000);
		
		//ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		
//		Set<String> windows = driver.getWindowHandles();
//		for (String window : windows) {
//		driver.switchTo().window(window);
//		
//		if (driver.getTitle().contains(windowTitle)) 
//		{   return;   
//				
//				}     
//			}     
//		}
		
		//driver.switchTo().window(tabs2.get(1));
		
		Thread.sleep(2000);
		
		System.out.println(driver.getPageSource());
		
	//WebElement accommodation = driver.findElement(By.cssSelector("#doSK > div.col.center.col-footer-links.keel-container > ul > li:nth-child(1) > a"));
		//accommodation.click();
		
		
		
		
		
		
	Thread.sleep(2000);
	driver.quit();	
		
	}

}
