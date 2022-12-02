package POM_With_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1_2ndtimepage
{

	//step1:variable declaration
	@FindBy(xpath="//input[@id='userCode']")          public WebElement UN;
    @FindBy(xpath="//input[@id='password']")         public WebElement PW;
    @FindBy(xpath="//div[text()='Sign into Upstox']")public WebElement LoginBtn;

	
	//Step2:variable initialization
	
	public UpstoxLogin1_2ndtimepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//Step3:VariableUsage
	public void enterUN()
	{
		UN.sendKeys("JE9293");
	}
	public void enterPW()
	{
		PW.sendKeys("pratham@12");
	}
	public void LoginBtn()
	{
		LoginBtn.click();
	}
	
	
	
	
}
