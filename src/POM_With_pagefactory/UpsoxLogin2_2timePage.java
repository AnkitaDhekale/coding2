package POM_With_pagefactory;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpsoxLogin2_2timePage 
{

@FindBy(xpath="//input[@id=\"yob\"]") private WebElement yearOfBirth;
	
	
	public UpsoxLogin2_2timePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterYOB() 
	{
		yearOfBirth.sendKeys("1999");
	}
	
}
	