package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import TestPages.SignInPage;

public class SignInTest extends BaseTest{
	
	
	
	@DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object[][] {{"testuser_1", "Test@123"}, {"testuser_2", "Test@1234"}};
	}
	
	
	@Test(dataProvider = "Authentication")
	//@Parameters({ "userName", "passWord" })
	public void userAbleToSignIn(String userName, String passWord) throws InterruptedException {
		
		SignInPage signInPage = new SignInPage(driver);
		signInPage.getUserName().sendKeys(userName);
		signInPage.getUserPassword().sendKeys(passWord);
		signInPage.getSignIn().click();
			
	}

	
	
	
	
	
	
	
	
	
	
	

}
