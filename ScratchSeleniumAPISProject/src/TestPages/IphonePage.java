package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphonePage extends BasePage{
	
	public IphonePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//span[@class='shopNow__label']") 
	public WebElement shopNow;
	
	public WebElement getShopNow() {
		return shopNow;
	}
	
	
	

}
