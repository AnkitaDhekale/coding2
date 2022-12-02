package POM_With_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginWelcome3_2ndtimePage 
{
	   
		@FindBy(xpath="//div[text()='No, I’m good']" )     private WebElement NOAmGood;
		
		
	      public  UpstoxLoginWelcome3_2ndtimePage(WebDriver driver)

		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickOnNoAmGood() 
		{

			NOAmGood.click();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
