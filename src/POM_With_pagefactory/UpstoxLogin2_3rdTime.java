package POM_With_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2_3rdTime 
{
	public class UpstoxLogin2
	{
		@FindBy(xpath="//input[@id=\"yob\"]") private WebElement yearOfBirth;
		
		
		public void UpstoxLogin2Page1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void enterYOB() 
		{
			yearOfBirth.sendKeys("1999");
		}
	}
	
	
	
	
	
	
}
