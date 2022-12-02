package POM_With_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomepage1
{
      
	@FindBy(xpath="//div[text()='No, I’m good']" )     private WebElement NOAmGood;
	
	
      public  UpstoxWelcomepage1(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNoAmGood() 
	{

		NOAmGood.click();
	}
	
}
