package POM_DDF_TestNG_BaseClass_UtilityClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2Page 
{
@FindBy(xpath="//input[@id=\"yob\"]") private WebElement yearOfBirth;
	
	
	public UpstoxLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterYOB(String YOB ) 
	{
		yearOfBirth.sendKeys(YOB);
	}
	
	
	
}
