package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 
{

public static void main(String[] args) 
{ 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	    
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys( "Dhekale") ;
	
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
	
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}
}	
	
}	

