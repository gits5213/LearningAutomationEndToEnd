package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
	
	public SignInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@name='email']") 
	public WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(xpath="//input[@id='ap_password']") 
	public WebElement userPassword;
	
	public WebElement getUserPassword() {
		return userPassword;
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']") 
	public WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	
	
}
