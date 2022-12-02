package PopUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_HiddenDivisionPopUp 
{
public static void main(String[] args) 
{
	System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	       driver.get("https://www.facebook.com/login/");
	       
	//enter UN
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");
	
	//enter PW
	driver.findElement(By.xpath("//input[@type='password']")).click();
	
	//Click on login button
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
