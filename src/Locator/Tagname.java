package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Amruta/Desktop/New%20html/Tagname.html");
	
	
	    //enter FN
	
	driver.findElement(By.tagName("input")).sendKeys("abc");
	
	   
	
	}	
	
	
}
