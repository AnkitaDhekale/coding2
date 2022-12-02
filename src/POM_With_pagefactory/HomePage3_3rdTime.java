package POM_With_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage3_3rdTime 
{

@FindBy(xpath="//span[@class='RjxSznXctoIyKq86cS-9I']") private WebElement PN;
	
	public void Home3_3rdTime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUserID() 
	{
		String actPN = PN.getText();
		String expPN="PRATHAMESH PANDURANG PATANGE";
		if (actPN.contains(expPN)) 
		{
			System.out.println("Pass");
		} 
		else 
		{
			System.out.println("Fail");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
