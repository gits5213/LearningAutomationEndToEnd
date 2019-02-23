package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBarMenu extends BasePage{
	
	public NavBarMenu(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#nav-link-accountList") 
	public WebElement account_List;
	
	public WebElement getAccount_List() {
		return account_List;
	}
	
}
