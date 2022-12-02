package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Amruta/Desktop/New%20html/Tagname2.html");
	
	       // enter FN
		driver.findElement(By.id("1234")).sendKeys("abc");
		
	   //  enter LN
	 driver.findElement(By.id("1234")).sendKeys("xyz");
		
	
	
	
	
	}	
	
}
