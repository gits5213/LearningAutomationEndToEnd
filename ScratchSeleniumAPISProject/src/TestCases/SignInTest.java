package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import TestPages.SignInPage;

public class SignInTest extends BaseTest{
	
	
	
	@Test
	@Parameters({ "userName", "passWord" })
	public void userAbleToSignIn(String userName, String passWord) throws InterruptedException {
		
		SignInPage signInPage = new SignInPage(driver);
		signInPage.getUserName().sendKeys(userName);
		signInPage.getUserPassword().sendKeys(passWord);
		signInPage.getSignIn().click();
			
	}

	
	
	

}
