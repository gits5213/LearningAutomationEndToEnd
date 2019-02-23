package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownList {

	public static void main(String[] args) {
		
		String Comdir = System.getProperty("user.dir");
		String ChromeDir = Comdir + "/browsers/chromedriver";
		System.setProperty("webdriver.chrome.driver", ChromeDir);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.td.com/us/en/personal-banking/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		
		
		
		

	}

}
