package TestCases;

import org.testng.annotations.Test;

import TestPages.HeaderElements;
import TestPages.HomePage;
import TestPages.IphonePage;


public class UserAbleToClickOnAddToCard extends BaseTest{
	
	
	
	@Test
	public void userAbleToClickOnAddToCard() throws InterruptedException {
		
		
		HomePage homePage = new HomePage(driver);
		IphonePage iPhonePage = new IphonePage(driver);
		HeaderElements headerElment = new HeaderElements(driver);

	
		if(homePage.getSearchBox().isEnabled() && homePage.getSearchBox().isDisplayed()) {
			homePage.getSearchBox().clear();
			homePage.getSearchBox().sendKeys("iPhone");
		}else {
			System.out.println("InputFiled is disable!");
		}
		
		Thread.sleep(2000);
		
		homePage.getSubmitButtont().submit();
		iPhonePage.getShopNow().click();
		headerElment.getCardButton().click();
		
		Thread.sleep(3000);
	
	}
	
}
