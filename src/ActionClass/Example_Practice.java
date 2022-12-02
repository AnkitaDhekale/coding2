package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Practice 
{
public static void main(String[] args)
{
	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	//click on login btn
	WebElement loginBtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	
	
	
	
	
	
	
}	
}
