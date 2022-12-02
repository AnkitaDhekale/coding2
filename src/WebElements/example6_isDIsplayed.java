package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isDIsplayed 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		boolean result=(boolean) driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
		
		
		if(result==true)
		{	
			System.out.println("Logo found");
		}	
		
		else 
		{
			System.out.println("Logo not found");
		}
		
		
		
	}
	
	
}
