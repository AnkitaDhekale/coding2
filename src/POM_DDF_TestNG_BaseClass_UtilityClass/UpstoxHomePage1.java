package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage1
{
	public class UpstoxHomePage 
	{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")  private WebElement PN;
		
		public UpstoxHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public String  verifyUserID() 
		{
			String actPN = PN.getText();
			return actPN;
		
		}
	
	
	
	
	
	
	
	
	
	
	
	}

	
}
