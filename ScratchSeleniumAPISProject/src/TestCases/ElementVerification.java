package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementVerification extends BaseTest{
	
	@Test
	public void userAbleToValidateUserNameInputField() throws InterruptedException {
		
		
		WebElement all = driver.findElement(By.cssSelector("#searchDropdownBox"));
		//all.click();
		System.out.println(all.getSize());
		
//		for (int i =0; i < all; i++) {
//			System.out.println(all.getSize());
//		}
		
		Thread.sleep(2000);
		
	
	
	}
	
	
	
	

}
