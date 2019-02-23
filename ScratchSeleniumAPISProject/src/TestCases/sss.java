package TestCases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sss{
	
	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void getList() throws InterruptedException {
		
		String macPath = System.getProperty("user.dir");
		String macDriverPath = macPath + "/DriverWin/chromedriver";
		System.setProperty("webdriver.chrome.driver", macDriverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement all = driver.findElement(By.cssSelector("#searchDropdownBox"));
		//all.click();
		System.out.println("------------------------------");
		Thread.sleep(2000);
		
		Select dropDownList = new Select(all);
		dropDownList.selectByIndex(6);
		Thread.sleep(2000);
		
		
		List<WebElement> allDropDownFromWeb = driver.findElements(By.cssSelector("#searchDropdownBox"));
		for (int i=0; i<allDropDownFromWeb.size(); i++) {
			System.out.println(allDropDownFromWeb.get(i).getText());
		}
		Thread.sleep(2000);
		
		
		
		
		driver.quit();
		
	        
	    }	

	}


