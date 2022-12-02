package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	//enter UN
	driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys();
	
	//enter PW
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(args);
	
	//Click on login btn
	driver.findElement(By.xpath("//input[@name='login-button']")).click();
	
	Boolean result=driver.findElement(By.xpath("")).isDisplayed();
	
	if(result==true)
	{
		System.out.println("Logo found =--->TC pass");
	}	
	else
	{
		System.out.println("Logo not found=---->TC fail");
	}	
		
		Thread.sleep(3000);
	
}
	
	
	
	
	
}
