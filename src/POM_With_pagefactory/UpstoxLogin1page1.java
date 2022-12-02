package POM_With_pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1page1 
{
	//step1: variable declaration
    @FindBy(xpath="//input[@id='userCode']") private WebElement UN;//private WebElement UN=driver.findElement(By.xpath("");
	@FindBy(xpath="//input[@name='password']") private WebElement PWD; //private WebElement PWD=driver.findElement(ByXPath("");
    @FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement loginBtn;//private WebElement loginBtn=driver.findElement(ByXpath(""));
	
	//Step2:variable initialization
	public UpstoxLogin1page1(WebDriver driver)
    {
      PageFactory.initElements(driver, this);
    }
    
    //Step:3 variable usage
    public void enterUN()
    {
    	UN.sendKeys("JE9293");
    }
    public void enterPWD()
    {
    	PWD.sendKeys("Pratham@12");
    }	
    public void clickOnLoginBtn()	
    {
    	loginBtn.click();
    }
    	
    }
    

