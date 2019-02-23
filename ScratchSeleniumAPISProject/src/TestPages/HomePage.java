package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#twotabsearchtextbox") 
	public WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	
	@FindBy(css="#nav-search > form > div.nav-right > div > input") 
	public WebElement submitButton;
	
	public WebElement getSubmitButtont() {
		return submitButton;
	}
	
}
