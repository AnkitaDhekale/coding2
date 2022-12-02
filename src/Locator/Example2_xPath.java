package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_xPath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
	
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");
	
	      driver.findElement(By.xpath("//button[@value='1']]")).click();
	      
	      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ABC");
	
	}
}
