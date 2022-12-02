package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Amruta/Desktop/New%20html/classname.html");
	
	       // enter FN
		driver.findElement(By.className("abc")).sendKeys("abc123");
		
	  //enter LN
		driver.findElement(By.className("abc")).sendKeys("xyz123");
		
		
}
}