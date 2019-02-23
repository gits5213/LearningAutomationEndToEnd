package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompareDropDownListElments {

		private WebDriver driver;

		@Test
		public void testUntitled() throws Exception {
			
			String Comdir = System.getProperty("user.dir");
			String ChromeDir = Comdir + "/browsers/chromedriver";
			System.setProperty("webdriver.chrome.driver", ChromeDir);
			driver = new ChromeDriver();
			
		    
			driver.get("http://register.rediff.com/commonreg/index.php?redr=http://portfolio.rediff.com/money/jsp/loginnew.jsp?redr=home");

		    int count = 0;
		    String[] expected = {"Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
		    
		    WebElement dropdown = driver.findElement(By.id("date_mon"));
		    Select select = new Select(dropdown);

		    List<WebElement> options = select.getOptions();
		    for (WebElement we : options) {
		        for (int i = 0; i < expected.length; i++) {
		            if (we.getText().equals(expected[i])) {
		                count++;
		            }
		        }
		    }
		    
		    if (count == expected.length) {
		        System.out.println("matched");
		    } else {
		        System.out.println("Houston, we have a problem.");
		    }
		}
		

}
