package FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Upstox 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login-v2.upstox.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//enter UN
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("username");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
