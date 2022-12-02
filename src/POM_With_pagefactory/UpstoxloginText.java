package POM_With_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxloginText 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		UpstoxLogin1Page login1=new UpstoxLogin1Page(driver);
		 login1.enterUN();
	     login1.enterPWD();
		login1.clickOnLoginBtn();
		
		UpstoxLogin2Page login2=new UpstoxLogin2Page(driver);
		login2.enterYOB();
		
		UpstoxWelcomePage welcome=new UpstoxWelcomePage (driver);
		welcome.clickOnNoAmGood();
		
		UpstoxHomePage home=new UpstoxHomePage (driver);
		home.verifyUserID();
		
		
		Thread.sleep(3000);
		
		//driver.close();

		
	}

	


	
	
	
	
	
	
	
}