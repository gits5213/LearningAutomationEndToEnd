package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderElements extends BasePage {
	
	public HeaderElements(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#nav-cart") 
	public WebElement cardButton;
	
	public WebElement getCardButton() {
		return cardButton;
	}

}
