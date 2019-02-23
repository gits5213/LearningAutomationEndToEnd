package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import TestPages.SignInPage;

public class BaseTest {
	
	
	public WebDriver driver;
	String expectedURL = "https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=";
	
	@BeforeClass
	public void beforeClass() {
		String Comdir = System.getProperty("user.dir");
		String ChromeDir = Comdir + "/browsers/chromedriver";
		System.setProperty("webdriver.chrome.driver", ChromeDir);
		driver = new ChromeDriver();
		
			
	}
	
	@BeforeMethod
	@Parameters({ "userName", "passWord" })
	public void beforeMethod(String userName, String passWord) {
		driver.get(expectedURL);
		String currectURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, currectURL);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		SignInPage signInPage = new SignInPage(driver);
		signInPage.getUserName().sendKeys(userName);
		signInPage.getUserPassword().sendKeys(passWord);
		signInPage.getSignIn().click();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test case is done!");
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		
	}
	

}
